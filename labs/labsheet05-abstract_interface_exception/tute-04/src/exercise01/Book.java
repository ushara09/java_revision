package exercise01;

import java.util.Scanner;

public class Book implements IDisplay, IInput {

    private String bookID, title, publisher;


    @Override
    public void print() {
        System.out.println("Books print method invokes !");
    }

    @Override
    public void printDetails() {
        System.out.println("Books print_Details method invokes !");
    }

    @Override
    public void input() {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter book id -");
        this.bookID = sn.nextLine();
        System.out.println("Enter title -");
        this.title = sn.nextLine();
        System.out.println("Enter publisher -");
        this.publisher = sn.nextLine();

    }
}
