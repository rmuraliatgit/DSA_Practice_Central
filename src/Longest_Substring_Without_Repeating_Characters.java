import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap < Character, Integer > hashMap = new HashMap< Character, Integer >();
        int left = 0, right = 0;
        int n = s.length();
        int answer = 0;
        while (right < n) {
            if (hashMap.containsKey(s.charAt(right))) left = Math.max(hashMap.get(s.charAt(right)) + 1, left);
            hashMap.put(s.charAt(right), right);
            answer = Math.max(answer, right - left + 1);
            right++;
        }
        return answer;
    }
}
