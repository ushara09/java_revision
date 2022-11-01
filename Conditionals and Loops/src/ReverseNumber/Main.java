package ReverseNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 19990921;
        int reversedNumber = 0;

        while(number > 0){
            int lastNum = number % 10;
            reversedNumber = reversedNumber * 10 + lastNum;
            number = number / 10;
        }

        System.out.println(reversedNumber);
    }
}
