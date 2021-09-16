package exercise02;

import java.util.Scanner;

public class MyMain {
    public static void main(String args[]){

        System.out.print("Enter the Name, StudentID and District:");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        String id  = sn.nextLine();
        String district = sn.nextLine();

        System.out.println("DitNo : "+id);
        System.out.println("Name : "+name);
        System.out.println("District : "+district);


    }
}
