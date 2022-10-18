package Medium.Array;

import java.util.*;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Set<Integer> set =new HashSet<>();
        for (int i: nums
             ) {
            set.add(i);
        }
        System.out.println(set);
        List<Integer> tempp = new ArrayList<>();
        Iterator iter = set.iterator();

        while (iter.hasNext()) {
           tempp.add((Integer) iter.next());
        }
        System.out.println(tempp);
    int n = tempp.get(tempp.size()-1);
        while(n>0) {
            temp.add(0);n--;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if(temp.get(nums[i])==0)
                temp.add(nums[i],1);
            else temp.add(nums[i],temp.get(nums[i])+1);
        }
        System.out.println(temp);
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i)>1)answer.add(i);
        }
        return answer;
    }
}
