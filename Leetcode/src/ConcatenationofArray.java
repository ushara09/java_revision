import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        ConcatenationofArray obj = new ConcatenationofArray();
        obj.concatArr(nums);
    }
    public int[] concatArr(int[] nums){

        int[] tempArr = nums;
        int[] concatedArr = new int[2 * nums.length];
        int newArrLenght = 2*nums.length;

        for(int i = 0; i < newArrLenght;i++){
            if(i >= newArrLenght/2){
                for (int j = 0; j < nums.length; j++) {
                    concatedArr[i] = tempArr[j];
                    i++;
                }
                break;
            }else {
                concatedArr[i] = tempArr[i];
            }
        }

        return concatedArr;
    }
}
