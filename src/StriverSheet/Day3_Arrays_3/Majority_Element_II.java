package StriverSheet.Day3_Arrays_3;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        majorityElement(nums);
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int num1 = -1, num2=-1, count1 = 0, count2=0;
        for (int i = 0; i < nums.length; i++) {
            if(num1==nums[i])count1++;
            else if(num2==nums[i])count2++;
            else if(count1==0){
                num1 = nums[i];
                count1++;
            }
            else if(count2==0){
                num2 = nums[i];
                count2++;
            }
            else{
                count1--;count2--;
            }

        }
        System.out.println(num1+" "+num2);
        int N = nums.length/3;
        count1 = 0; count2=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==num1)count1++;
            if(nums[i]==num2)count2++;
        }
        if(count1>N)answer.add(num1);
        if(count2>N)answer.add(num2);
        return answer;
    }
}
