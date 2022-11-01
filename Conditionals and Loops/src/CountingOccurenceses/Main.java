package CountingOccurenceses;

public class Main {
    public static void main(String[] args) {
        int num = 66666677;
        int checkingNum = 6;
        int count = 0;

        // first way (brute force approach)
//        int length = (int)(Math.log10(num)+1); // number of digits in the num
//
//        for(int i = 1; i <= length; i++){
//            int lastNum = num % 10; //last digit of the number
//            if(lastNum == checkingNum){
//                count++;
//            }
//            num = num / 10; //remove last digit from the number
//        }


        //second way
        while (num > 0){
            int rem = num % 10;
            if(rem == checkingNum){
                count++;
            }
            num = num /10;
        }


        System.out.println(count);
    }
}
