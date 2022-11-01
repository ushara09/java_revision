package largestNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // find the largest of the 3 numbers

        // first way
        max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("max - "+max);

        // second way
//        int maxValue = Math.max(c, Math.max(a, b));
//        System.out.println(maxValue);

    }
}
