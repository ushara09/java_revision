import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Scanner sn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }

        for(int num: arr){
            System.out.print(num + " ");
        }

//        System.out.println(Arrays.toString(arr));
    }
}
