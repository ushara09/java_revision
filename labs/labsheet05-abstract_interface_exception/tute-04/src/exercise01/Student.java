package exercise01;

import java.util.Scanner;

public class Student implements IDisplay, IInput {
    private String studentID, name;

    @Override
    public void print() {
        System.out.println("Student print method invokes !");
    }

    @Override
    public void printDetails() {
        System.out.println("Student print_Details method invokes !");
    }

    @Override
    public void input() {

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter ID -");
        this.studentID = sn.nextLine();
        System.out.println("Enter name -");
        this.name = sn.nextLine();

    }
}
