package ThreadJoin;

public class ThreadJoin extends Thread{
    public static void main(String[] args) {

        Thread t = new Thread(new ThreadJoin(), "New Thread");
        t.start();
        System.out.println("Started executing main thread");

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        System.out.println("Finish executing - "+ Thread.currentThread().getName());


    }

    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("Started executing - "+t.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + i);
        }
        System.out.println("Finish executing - "+ t.getName());
    }
}
