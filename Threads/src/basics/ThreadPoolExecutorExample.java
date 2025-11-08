package basics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates direct usage of ThreadPoolExecutor.
 *
 * This class helps understand:
 * - How thread pools work under the hood.
 * - What the different parameters in ThreadPoolExecutor mean.
 * - How threads are created, reused, and destroyed.
 */
public class ThreadPoolExecutorExample {

    public static void main(String[] args) {

        /*
         * ===========================================================
         * ThreadPoolExecutor — The Core of Java's Executor Framework
         * ===========================================================
         *
         * ThreadPoolExecutor is the most flexible and low-level way
         * to manage a pool of threads in Java.
         *
         * Executors.newFixedThreadPool(), newCachedThreadPool(), etc.
         * are just convenience wrappers that configure a ThreadPoolExecutor
         * with predefined parameters.
         *
         * Constructor:
         * ThreadPoolExecutor(
         *     int corePoolSize,
         *     int maximumPoolSize,
         *     long keepAliveTime,
         *     TimeUnit unit,
         *     BlockingQueue<Runnable> workQueue
         * )
         *
         * Parameters explained:
         * 1. corePoolSize → Minimum number of threads to keep alive (even if idle).
         * 2. maximumPoolSize → Maximum number of threads allowed in the pool.
         * 3. keepAliveTime → Time for which idle threads (beyond corePoolSize) are kept alive before termination.
         * 4. unit → Time unit for keepAliveTime.
         * 5. workQueue → Queue that holds tasks before they are executed.
         *                (Tasks are queued when all core threads are busy.)
         *
         * Thread creation logic:
         *  - If current thread count < corePoolSize → create a new thread.
         *  - Else if queue is not full → put the task in the queue.
         *  - Else if thread count < maximumPoolSize → create a new thread.
         *  - Else → reject the task (handled by RejectedExecutionHandler).
         *
         */

        // Define a blocking queue to hold waiting tasks
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(3);

        // Create a ThreadPoolExecutor manually
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,               // corePoolSize → keep 2 threads always alive
                4,               // maximumPoolSize → can grow up to 4 threads if queue fills
                10,              // keepAliveTime → non-core threads (above 2) live for 10 seconds when idle
                TimeUnit.SECONDS,
                workQueue        // queue that holds tasks before execution
        );

//        // Optional: you can also set a RejectedExecutionHandler to handle excess tasks
        threadPoolExecutor.setRejectedExecutionHandler((r, executor) -> {
            System.out.println("Task " + r.toString() + " rejected due to pool overload!");
        });

        System.out.println("ThreadPoolExecutor Example:");
        System.out.println("--------------------------------");

        /*
         * Submit multiple tasks to the pool.
         * - The first few tasks create core threads.
         * - When all core threads are busy, new tasks go into the queue.
         * - When the queue is full, extra threads (up to maxPoolSize) are created.
         * - Beyond that, new tasks are rejected.
         */
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            threadPoolExecutor.execute(() -> {
                System.out.println("Task " + taskId + " executed by thread: "
                        + Thread.currentThread().getName());
                try {
                    // Simulate some work
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        /*
         * After submitting tasks:
         * - The pool will start executing tasks immediately.
         * - Threads will be reused for new tasks when old ones complete.
         * - Idle extra threads (above corePoolSize) will die after keepAliveTime seconds.
         */

        // shutdown() prevents new tasks from being accepted and allows existing ones to complete
        threadPoolExecutor.shutdown();

        /*
         * ======================
         * Theoretical Summary:
         * ======================
         *
         * ThreadPoolExecutor gives you precise control over:
         *  - Thread creation and termination.
         *  - Task queuing policy.
         *  - Rejection handling strategy.
         *
         * This is useful for:
         *  - High-performance server applications.
         *  - Systems that need custom resource management.
         *  - Fine-tuned concurrency control.
         *
         * Common queue types:
         *  - LinkedBlockingQueue (unbounded or bounded) → used by FixedThreadPool.
         *  - SynchronousQueue → used by CachedThreadPool (no storage, direct handoff).
         *  - DelayedWorkQueue → used by ScheduledThreadPoolExecutor.
         *
         * RejectedExecutionHandler options:
         *  - AbortPolicy (default) → throws RejectedExecutionException.
         *  - DiscardPolicy → silently drops the task.
         *  - DiscardOldestPolicy → drops the oldest queued task and adds the new one.
         *  - CallerRunsPolicy → executes the task in the caller’s thread.
         */
    }
}
