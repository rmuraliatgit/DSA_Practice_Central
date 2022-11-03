package Stacks.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while(stack.isEmpty()==false && stack.peek()<=nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()==false){
                    ans[i] = stack.peek();
                }
                else{
                    ans[i] = -1;
                }
            }
            stack.push(nums[i%n]);

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        nextGreaterElements(nums);
    }
}
