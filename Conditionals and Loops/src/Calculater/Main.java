package Calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double answer = 0;
        while (true){
            System.out.print("Enter the operator : ");
            char op = sn.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter 2 numbers :");
                int a = sn.nextInt();
                int b = sn.nextInt();

                if (op == '+') {
                    answer = a + b;
                }
                if (op == '-') {
                    answer = a - b;
                }
                if (op == '*') {
                    answer = a * b;
                }
                if (op == '/') {
                    if(b !=0){
                        answer = a / b;
                    }else {
                        System.out.println("cannot divide by 0");
                        continue;
                    }
                }
                if(op == '%'){
                    answer = a % b;
                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid Operator !!");
                continue;
            }
            System.out.println(answer);
        }

    }
}
