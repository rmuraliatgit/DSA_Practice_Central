package Medium.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Words_in_a_String
{
    public static void main(String[] args) {
        String s = "a good   example";
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String answer = "";
        List<String> l = new ArrayList<>();
        l.addAll(List.of(str));
        System.out.println(l);
        l.removeAll(Collections.singleton(""));
        System.out.println(l);
        for (int i = l.size()-1; i >=0; i--) {
            if(i!=0)
            answer+=l.get(i)+" ";
            else {
                answer += l.get(i);
            }
        }
        System.out.println(answer);
        return answer.trim();
    }
}
