import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {

        BuildArrayfromPermutation obj = new BuildArrayfromPermutation();
        int[] input = {5,0,1,2,3,4};
        int[] ans = obj.buildArray(input);
        System.out.println(Arrays.toString(ans));
    }

    public int[] buildArray(int[] nums){
        int[] tempArr = nums;
        int[] ans = new int[nums.length];

        for(int i = 0; i < tempArr.length; i++){
//            int index = tempArr[i];
            ans[i] = tempArr[tempArr[i]];
        }

        return ans;
    }
}
