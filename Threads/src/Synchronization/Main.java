package Synchronization;

public class Main {
    public static void main(String[] args) {
        Screen obj1 = new Screen();
        Screen obj2 = new Screen();
        ChildThread t1 = new ChildThread(obj1, "Hello");

        ChildThread t2 = new ChildThread(obj2,"world");
    }
}
