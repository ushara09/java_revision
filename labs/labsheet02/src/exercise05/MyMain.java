package exercise05;

public class MyMain {
    public static void main(String args[]){
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        boolean result = evenOddNumber.findEvenOrOdd(6);

        if(result == true){
            System.out.println("Number is Even");
        }else
            System.out.println("Number is odd");

    }
}
