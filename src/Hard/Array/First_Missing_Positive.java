package Hard.Array;

import java.util.Arrays;

public class First_Missing_Positive {
    public static void main(String[] args) {
       int[] nums = {3,4,-1,1};
       firstMissingPositive(nums);

    }
    public static int firstMissingPositive(int[] nums) {
        int min = Arrays.stream(nums)
                  .min()
                  .getAsInt();
        System.out.println(min);
        if(min<0){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]<0){
                    nums[i]=0;
                }
            }
        }
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i+1!=nums[i])return i;
        }




        return -1;
    }
}
