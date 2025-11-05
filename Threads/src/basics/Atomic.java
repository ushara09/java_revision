package basics;


import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter{

    /**
     *
     * AtomicInteger CLASSES
     *
     * Increments the counter atomically without explicit synchronization.
     *
     * This uses the AtomicInteger class, which provides lock-free,
     * thread-safe operations on integers. Internally, it relies on
     * the Compare-And-Swap (CAS) mechanism provided by the CPU.
     *
     * CAS ensures that the variable is only updated if its current value
     * matches an expected value, thereby preventing race conditions
     * without using the 'synchronized' keyword or explicit locking.
     *
     * This approach is typically more performant in scenarios with
     * high thread contention, since it avoids blocking threads.


    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
     */

    //==================================

    /**
     * synchronized usage
     * Increments the shared counter in a thread-safe manner.
     *
     * The 'synchronized' keyword ensures that only one thread at a time
     * can execute this method on the same object instance. This prevents
     * race conditions, where multiple threads try to modify 'count'
     * simultaneously, potentially leading to data inconsistency.
     *
     * Mechanism:
     * - When a thread enters this method, it acquires the intrinsic lock (monitor)
     *   associated with the current 'SharedCounter' instance.
     * - Other threads attempting to execute any synchronized method on the same
     *   instance are blocked until the lock is released.
     * - Once the method completes (or an exception occurs), the lock is automatically
     *   released, allowing other waiting threads to proceed.
     *
     * Note:
     * Synchronization provides *mutual exclusion* and *memory visibility* guarantees:
     * changes made by one thread become visible to others once the lock is released.
     */

    private int count;
    public synchronized void increment(){count++;}
    public int getCount(){return count;};
}

public class Atomic {

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        //Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 started");
            for(int i=0;i< 50000;i++){
                sharedCounter.increment();
            }
            System.out.println("Thread 1 completed");
        }).start();

        //Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            for(int i=0;i< 50000;i++){
                sharedCounter.increment();
            }
            System.out.println("Thread 2 completed");
        }).start();

        Thread.sleep(3000);

        System.out.println("Final Count - "+sharedCounter.getCount());

    }
}
