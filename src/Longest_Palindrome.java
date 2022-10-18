import java.util.*;

public class Longest_Palindrome {
    public static void main(String[] args) {
        String s = "ababababa";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {

        int answer = 0;
        int temp = 0;

        Map<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(Character.valueOf(s.charAt(i)), hashMap.containsKey(s.charAt(i)) ? (hashMap.get(s.charAt(i)) + 1) : 1);
        }

        if(hashMap.size()==1)return hashMap.get(s.charAt(0));
        System.out.println(hashMap);
        Iterator<Map.Entry<Character,Integer>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Character,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>1) {
                int t = entry.getValue();
                if(t%2==0)
                 answer += entry.getValue();
                else answer+=entry.getValue()-1;
            }
            else if(entry.getValue()==1)temp++;
        }
        if(temp>=1){
            answer++;
        }
        System.out.println(answer);
        return answer;
    }
}
