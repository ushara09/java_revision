public class MainThread {
    public static void main(String[] args) {

        ChildThread1 obj = new ChildThread1();
       // obj.run(); this is not working... to invoke the thread we need to use start() method
        obj.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread");

        }
    }
}

class ChildThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("child Thread 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


