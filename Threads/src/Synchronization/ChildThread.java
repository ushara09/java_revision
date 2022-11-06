package Synchronization;

public class ChildThread extends Thread{

    Screen obj;
    String message;

    public ChildThread(Screen obj, String message) {
        this.obj = obj;
        this.message = message;
        start();
    }

    public void run(){
        obj.display(message);
    }
}
