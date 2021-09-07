package exercises;

import java.util.Scanner;

public class MyMain {

    public static void main(String args[]) {

        //exercise_01
//        System.out.println("Hello World !");
//        System.out.print("It's been nice to knowing you\nGoodbye world !");

        //exercise_02
//        System.out.println("===================================");
//        System.out.println("=\tStudent Information\t=");
//        System.out.println("===================================");
//        System.out.println("=Name\t:ARDP Ranasingha");
//        System.out.println("=RegNo\t:DIS\\08\\1234");
//        System.out.println("=Address\t:Malabe");

        //exercise_03
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age");
//        int age = sc.nextInt();
//
//        if(age > 18){
//            System.out.println("Adult");
//        }else{
//            System.out.println("Child");
//        }

        //exercise_04
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value");
//        int val = sc.nextInt();
//        switch (val) {
//            case 1:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Monday");
//                break;
//            case 2:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Wensday");
//                break;
//            case 4:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Thursday");
//                break;
//            case 5:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Friday");
//                break;
//            case 6:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Saturday");
//                break;
//
//            case 7:
//                System.out.println("Value of the day: " + val);
//                System.out.println("Day of the week: Sunday");
//                break;
//
//            default:
//                System.out.println("Invalid input");
//                break;
//        }
//
//        System.out.println("Good Bye !");

        //exercise_07
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;
        double average = sum/2;

        System.out.println("Summation of the two numbers is - "+sum);
        System.out.println("Average is - "+average);




    }

}
