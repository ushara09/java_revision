package Fibunachi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        /*
        *  Q - find the n th Fibonacci
        * */

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);

//        for (int i = 1; i < n; i++) {
//           int temp = b;
//           b = b + a;
//           a = temp;
//
//        }

//        System.out.println(b);

    }
}
