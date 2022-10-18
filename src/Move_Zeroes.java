import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[]  nums = {0,1,0,3,12};
        moveZero(nums);
    }
    public static void moveZeroes(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0, right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            int x = right;
            if(nums[left]==0){
                int temp = nums[right];
                nums[right]=nums[left];
                int p = 1;
                while (p <= 1) {
                    int last = nums[0];
                    for (int j = 0; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = last;
                    p++;
                }
            }

        }
        for (int i:nums
             ) {
            System.out.print(i+" ");
        }
    }
    public static void moveZero(int[] nums){
        int left = 0, right = nums.length-1;
        int[] temp = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) {
                temp[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i]=temp[i];
        }
        for (int i:nums
        ) {
            System.out.print(i+" ");
        }
    }

}
