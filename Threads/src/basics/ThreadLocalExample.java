package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ThreadLocalExample {

    public static void main(String[] args) {
        ThreadLocal<Long> userIdThreadLocal = new ThreadLocal<>();

        // Simulate a user landing on a webpage
        Long userId1 = 12345L;
        Long userId2 = 67890L;

        // Handle user req in a new thread
        Thread userOneThread = new Thread(() -> {

            System.out.println("Started the thread for "+userId1);
            userIdThreadLocal.set(userId1);
            System.out.println("Thread local for user 1 - "+ userIdThreadLocal);
            System.out.println("Complete the logic for "+userId1);
            userIdThreadLocal.remove();
            System.out.println("Thread local for user 1 - "+ userIdThreadLocal);

        });

        Thread userTwoThread = new Thread(() -> {

            System.out.println("Started the thread for "+userId2);
            userIdThreadLocal.set(userId2);
            System.out.println("Thread local for user 2 - "+ userIdThreadLocal);
            System.out.println("Complete the logic for "+userId2);
            userIdThreadLocal.remove();
            System.out.println("Thread local for user 2 - "+ userIdThreadLocal);

        });

        userOneThread.start();
        userTwoThread.start();


    }

}
