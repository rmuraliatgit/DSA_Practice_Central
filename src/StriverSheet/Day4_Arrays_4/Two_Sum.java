package StriverSheet.Day4_Arrays_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 6;
        twoSum(nums,target);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i <nums.length; i++) {
            if(hashMap.containsKey(target-nums[i])){
                answer[0]=i;
                answer[1]= hashMap.get(target-nums[i]);
                break;
            }
            else hashMap.put(nums[i],i);
        }
        for (int i:answer
             ) {
            System.out.println(i);
        }


        return answer;
    }
}
