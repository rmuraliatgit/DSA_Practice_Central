package BiWeekly.Sep3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Find_Subarrays_With_Equal_Sum {
    public static void main(String[] args) {
       int[] nums = {4,2,4};
       findSubarrays(nums);
    }
    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length-1; i++) {
            counter.put(nums[i]+nums[i+1], counter.containsKey(nums[i]+nums[i+1]) ? (counter.get(nums[i]+nums[i+1]) + 1) : 1);
        }
        Iterator<Map.Entry<Integer,Integer>> entries = counter.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>1)return true;
        }
        return false;
    }
}