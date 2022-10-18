package Medium.String;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE , sum=0 ;
        Map<Character,Integer> hashMap = new HashMap<>();

        for(int i=1;i<s.length();i++){
            hashMap.put(Character.valueOf(s.charAt(i)), hashMap.containsKey(s.charAt(i)) ? (hashMap.get(s.charAt(i)) + 1) : 1);

            if(s.charAt(i)==s.charAt(i-1)){
                sum=0;
            }else sum++;

            if(sum>max)
            {
                max=sum;
            }

        }
        System.out.println(max);
        return max;
    }
}
