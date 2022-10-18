import java.util.Arrays;

public class Vaild_Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        isAnagram(s,t);
    }
    public static boolean isAnagram(String s, String t) {
        boolean answer = false;
        if(s.length()!=t.length())return false;
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        if(String.valueOf(S).equals(String.valueOf(T)))return true;
        else return false;

    }
}
