import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {7,8,8,8,9,9};
        frequencySort(nums);
    }
    public static int[] frequencySort(int[] nums) {
        int answer[] = new int[nums.length];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i : nums
        ) {
            hashMap.put(i, hashMap.containsKey(i) ? (hashMap.get(i) + 1) : 1);
        }
        System.out.println("hashmap: "+hashMap);
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        index.addAll(hashMap.values());
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(hashMap.keySet());
        Collections.sort(index);
        System.out.println("index: "+index);
        System.out.println("temp: " + temp);
        for (int i = 0; i < index.size(); i++) {
            int t = index.get(i);
            if(t==hashMap.get(temp.get(i))) {
                while (t > 0) {
                    ans.add(temp.get(i));
                    t--;
                }
            }
        }
        for (int i = 0; i < hashMap.size(); i++) {
            if(hashMap.containsValue(index.get(i))){
                int t =index.get(i);
                while(t>0){

                }
            }
        }
        System.out.println("answer: "+ans);
        return answer;
    }
}
