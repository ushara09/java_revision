package basics;

//class MyTask{
//    static void executeTask(){
//        for(int doc=1; doc<=10;doc++){
//            System.out.println("Printing Document - "+doc+" - printer 2");
//        }
//    }
//}

//class MyTask extends Thread{
//    @Override
//     public void run(){
//        for(int doc=1; doc<=10;doc++){
//            System.out.println("Printing Document - "+doc+" - printer 2");
//        }
//    }
//}

class MyTask implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10;doc++){
            System.out.println("Printing Document - "+doc+" - printer 2");
        }
    }
}

public class App {
    //main method represents main thread
    public static void main(String[] args) {
        // whatever we write in here will be executed by main thread
        // threads always execute the jobs in a sequence

        //job1
        System.out.println("=== Application Started === ");

        //job 2
//        MyTask.executeTask();

//        MyTask task = new MyTask(); //child thread / worker thread
//        task.start();

        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();

        //Till job 2 is not finished, below written jobs are waiting and are not executed
        //In case job2 is a long-running operation
        // In such a case OS/JVM shall give a message that app is not responding

        //job 3
        for(int doc=1; doc<=10;doc++){
            System.out.println("Printing Document - "+doc+" - printer 1");
        }

        //job 4
        System.out.println("=== Application Finished ===");

    }
}
