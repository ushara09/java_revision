package basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        /*
         * ==============================
         *  SINGLE THREAD EXECUTOR
         * ==============================
         *
         * Executors.newSingleThreadExecutor():
         * → Creates an ExecutorService that uses only ONE worker thread.
         * → All submitted tasks are executed sequentially (one after another).
         * → Good for maintaining a single-threaded workflow while using ExecutorService abstraction.
         */
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("Single Thread Executor :");

        // Submitting multiple tasks to the single-thread executor
        for (int i = 1; i <= 5; i++) {
            final int taskId = i; // 'final' or effectively final is required inside lambda
            singleThreadExecutor.execute(() -> {
                // This message will always print in order because only one thread is executing tasks
                System.out.println("Single thread task " + taskId + " executed by thread : "
                        + Thread.currentThread().getName());
            });
        }

        // shutdown() tells the executor to stop accepting new tasks and finish existing ones
        singleThreadExecutor.shutdown();


        /*
         * ==============================
         *  FIXED THREAD POOL
         * ==============================
         *
         * Executors.newFixedThreadPool(n):
         * → Creates a pool with a fixed number (n) of threads.
         * → If more tasks are submitted than threads available, tasks wait in a queue until a thread is free.
         * → Useful for controlling concurrency and resource usage.
         */
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("Fixed thread pool:");

        // Submitting 5 tasks to a pool of 3 threads
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            fixedThreadPool.execute(() -> {
                // Multiple threads (up to 3) will execute these tasks concurrently
                System.out.println("Fixed thread task " + taskId + " executed by thread : "
                        + Thread.currentThread().getName());
            });
        }

        // Always shut down an ExecutorService when done
        fixedThreadPool.shutdown();


        /*
         * ==============================
         *  CACHED THREAD POOL
         * ==============================
         *
         * Executors.newCachedThreadPool():
         * → Creates a dynamically sized thread pool.
         * → Reuses existing threads if available; otherwise creates new threads as needed.
         * → Idle threads are terminated after 60 seconds of inactivity.
         * → Best for short-lived asynchronous tasks with unpredictable load.
         */
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("Cached thread pool:");

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            cachedThreadPool.execute(() -> {
                // Tasks may run in parallel; new threads created as needed
                System.out.println("Cached thread task " + taskId + " executed by thread : "
                        + Thread.currentThread().getName());
            });
        }

        cachedThreadPool.shutdown();


        /*
         * ==============================
         *  SCHEDULED THREAD POOL
         * ==============================
         *
         * Executors.newScheduledThreadPool(n):
         * → Used for executing tasks after a delay or periodically.
         * → Similar to Timer, but more flexible and supports multiple threads.
         * → Here we use schedule() to delay execution by 3 seconds.
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("Scheduled thread pool:");

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            scheduledThreadPool.schedule(() -> {
                // This task executes after a delay of 3 seconds
                System.out.println("Scheduled thread task " + taskId + " executed by thread : "
                        + Thread.currentThread().getName());
            }, 3, TimeUnit.SECONDS); // delay = 3 seconds
        }

        // Even for ScheduledExecutorService, we eventually need to shut it down
        scheduledThreadPool.shutdown();

        /*
         * Notes:
         * - shutdown() → Prevents new tasks from being submitted but allows existing tasks to complete.
         * - shutdownNow() → Attempts to stop all actively executing tasks and halts waiting tasks.
         * - Always shut down executors to prevent memory leaks or non-terminating programs.
         *
         * Summary:
         * - newSingleThreadExecutor(): sequential, one thread
         * - newFixedThreadPool(n): fixed number of concurrent threads
         * - newCachedThreadPool(): flexible, creates threads as needed
         * - newScheduledThreadPool(n): executes tasks after delay or periodically
         */
    }
}
