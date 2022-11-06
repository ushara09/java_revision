import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {

        int[] nums = {3,1,2,10,1};
        RunningSumof1dArray obj = new RunningSumof1dArray();
        obj.arrSum(nums);

    }
    public int[] arrSum(int[] nums){

        int[] tempArr = nums;
        int[] summedArr = new int[nums.length];
        int total = 0;
        for(int i = 0; i < nums.length; i++){

            summedArr[i] = tempArr[i] + total;
            total = summedArr[i];
        }

        System.out.println(Arrays.toString(summedArr));
        return summedArr;
    }
}
