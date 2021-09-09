package exercise01;

public class Main {
    public static void main(String srgs[]){
        //creating referennce from the class
        Book book = new Book();
        book.input();
        book.print();
        book.printDetails();

        System.out.println("==========================================");

        //creating reference from the interface
        IInput iInput = new Student();
        iInput.input();

        //creating reference from the interface
        IDisplay iDisplay = new Student();
        iDisplay.print();
        iDisplay.printDetails();

    }
}
