import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        majorityElements(nums);
    }
    public static int majorityElement(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int count = 0, Max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>(nums.length/2)) {
                Max = count;
                answer = nums[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static int majorityElements(int[] nums){
        int answer = 0 ;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int ch : nums)
             hashMap.put(ch, hashMap.containsKey(ch) ? (hashMap.get(ch) + 1) : 1);
        System.out.println(hashMap.keySet());
        for (int ch : hashMap.keySet()) {
            if(hashMap.get(ch)>(nums.length/2)) {
                answer = ch;break;
            }
        }
        return answer;
    }
}