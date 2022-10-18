import java.util.*;

public class Find_Resultant_Array_After_Removing_Anagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        removeAnagrams(words);

    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> answer = new ArrayList<>();
        List<String> t = new ArrayList<>();
        t.addAll(List.of(words));
        List<String> ans = new ArrayList<>();
        Set<Character> first = new HashSet<>();
        char[] temp = null;
        answer.addAll(List.of(words));
        System.out.println(answer.size()+" "+words.length);

        for (int i = 0; i < words.length-1; i++) {
            System.out.println("answer: "+ t);
            temp = words[i].toCharArray();
            char[] temp2 = words[i+1].toCharArray();
            Arrays.sort(temp);
            Arrays.sort(temp2);
            System.out.println(Arrays.toString(temp) +" "+ Arrays.toString(temp2)+" "+String.valueOf(Arrays.toString(temp)).equals(String.valueOf(Arrays.toString(temp2))));
            if(String.valueOf(Arrays.toString(temp)).equals(String.valueOf(Arrays.toString(temp2))))
            {
                System.out.println("a:"+t);
                ans.add(answer.get(i));
                t.remove(words[i+1]);
            }
        }
        System.out.println("answer: "+t);
        return ans;
    }
}
