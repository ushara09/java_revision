package CaseCheck;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
/*
* assume input is lowercase and convert it into uppercase
* */
        Scanner sn = new Scanner(System.in);
        char character = sn.next().trim().charAt(0);//getting the input char

        // first way
//        String theChar = String.valueOf(character); // convert char -> String
//        String uppercasedChar = theChar.toUpperCase(); //converting input to uppercase
//
//        if(theChar == uppercasedChar){
//            System.out.println("Uppercase Character");
//        }else {
//            System.out.println("Lowercase Character");
//        }

        //second way
        if(character >= 'a' && character <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }


    }
}
