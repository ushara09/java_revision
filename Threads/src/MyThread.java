public class MyThread extends Thread {
    public static void main(String[] args) {

        MyThread obj = new MyThread();
        obj.start();

        //implement thread using runnable interface
        ChildThread2 childThread2 = new ChildThread2();
        Thread runnableThread = new Thread(childThread2);
        runnableThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main method Thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.println("Sub Thread");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


