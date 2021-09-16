package question01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {

    public static void main(String args[]) {

        double sqrt;

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number -");

        try {
            double num = sn.nextDouble();
            sqrt = Math.sqrt(num);
            System.out.println("The square root is " + sqrt);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }finally {
            System.out.println("Final block executed !");
        }


    }


}
