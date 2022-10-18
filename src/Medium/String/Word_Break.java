package Medium.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word_Break {
    public static void main(String[] args) {
       String s = "leetcode";List<String> wordDict = new ArrayList<>(Arrays.asList(new String[]{"leet","code"})) ;
       wordBreak(s,wordDict);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        System.out.println(s+" "+wordDict);

        String temp = "";
        for (String x:wordDict
             ) {
            temp+=x;
        }
        if(s.contains(temp))return true;
        else return false;
    }
}
