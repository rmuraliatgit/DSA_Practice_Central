import java.util.Arrays;

public class Count_Elements_With_Strictly_Smaller_and_Greater_Elements {
    public static void main(String[] args) {
        int[] nums = {11,1,1,1,2,2,2,3};
        countElements(nums);
    }
    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        int min = nums[0], max = nums[nums.length-1];
        System.out.println(min+" "+max);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=min && nums[i]!=max)count++;
        }

        return count;
    }
}
