package exercise03;

import java.util.Scanner;

public class Mymain {
    public static void main(String args[]){

        int length, width, height;

        System.out.println("Enter length, width and height of the cube :");

        Scanner sn = new Scanner(System.in);
        length = sn.nextInt();
        width = sn.nextInt();
        height = sn.nextInt();

        int volume = length * width * height;

        System.out.println("Volume is - "+volume);
    }
}
