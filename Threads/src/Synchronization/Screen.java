package Synchronization;

public class Screen {
    //synchronizing the entire method
    public synchronized void display(String msg){
        System.out.print("[ "+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ]");
    }
}


//class Screen1 {
//    public void display(String msg){
//        /*
//         *
//         *  some code that doesnt need to be synchronized
//         *
//         * */
//        synchronized (msg){ //synchronizing a part of a method
//            System.out.print("[ "+msg);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(" ]");
//        }
//
//    }
//}
