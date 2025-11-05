package basics;

/**
 * This program demonstrates how the 'volatile' and 'synchronized' keywords
 * affect visibility and synchronization between threads in Java.
 *
 * Theory Refresher:
 * -----------------
 * - 'volatile' ensures *visibility* of changes to variables across threads.
 *   Without 'volatile', one thread may cache the variable and never see updates
 *   made by another thread.
 *   In this example, Thread 2 may never see the updated 'flag' unless it’s
 *   declared volatile.
 *
 * - 'synchronized' provides both *mutual exclusion* and *visibility*.
 *   Synchronizing the get/set methods would also guarantee that Thread 2
 *   sees the updated value, because entering/exiting a synchronized block
 *   establishes a *happens-before* relationship.
 *
 * Summary:
 * - Use 'volatile' when multiple threads read/write a variable but no atomic
 *   operations or invariants need to be maintained.
 * - Use 'synchronized' when you also need to protect compound actions or ensure
 *   atomicity along with visibility.
 */


class SharedResource{
    private volatile boolean flag = false;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class Volatile_Keyword {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        //Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                System.out.println("Thread 1 logic started");
                Thread.sleep(10000);
                System.out.println("Thread 1 logic completed");
                sharedResource.setFlag(true);
                System.out.println("Flag set by thread 1");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();


        //Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            while (!sharedResource.getFlag()){
                // It will run until flag value is true
            }
            System.out.println("Thread 2 logic completed");
        }).start();

    }
}
