package basics;

class Printer{
    synchronized void printDocument(int numOfCopies, String docName){
        for (int i=1;i<=numOfCopies;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" - "+i);
        }
    }
}

class MyThread extends Thread{
    Printer printer;

    MyThread(Printer p){
        printer = p;
    }
    @Override
    public void run(){
        printer.printDocument(10,"Duma.pdf");
    }
}

class YourThread extends Thread{
    Printer printer;

    YourThread(Printer p){
        printer = p;
    }
    @Override
    public void run(){
        printer.printDocument(10,"Kamal.pdf");
    }
}

public class SyncApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Application Started ===");

        // we have one single object of printer
        Printer printer = new Printer();


        // Scenario os that we have multiple threads working on the same Printer Object
        // If Multiple Threads are going to work on the same single object, we must Synchronize them
        MyThread myT = new MyThread(printer);
        YourThread yourT = new YourThread(printer);
        myT.start();
//        myT.join();
        yourT.start();

        System.out.println("=== Application Finished ===");
    }
}
