public class ChildThread2 implements Runnable{
   public void run(){
       for (int i = 0; i < 50; i++) {
           System.out.println("Child thread 2");
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
