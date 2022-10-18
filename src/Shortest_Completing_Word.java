import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shortest_Completing_Word {
    public static void main(String[] args) {
      String  licensePlate = "1s3 PSt";
      String[] words = {"step","steps","stripe","stepple"};
      shortestCompletingWord(licensePlate,words);
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String answer = "";
        String temp = "";
        for (int i = 0; i < licensePlate.length(); i++) {
            if(Character.isAlphabetic(licensePlate.charAt(i)))temp+=String.valueOf(licensePlate.charAt(i)).toLowerCase();
        }
        System.out.println("Licenseplate: "+temp);
        Map<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < temp.length(); i++) {
            hashMap.put(Character.valueOf(temp.charAt(i)), hashMap.containsKey(temp.charAt(i)) ? (hashMap.get(temp.charAt(i)) + 1) : 1);
        }
        System.out.println(hashMap);
        Map<Character,Integer> t = new HashMap<>();;
        for (String word:words
             ) {

            for (int i = 0; i < word.length(); i++) {
                t.put(Character.valueOf(word.charAt(i)), t.containsKey(word.charAt(i)) ? (t.get(word.charAt(i)) + 1) : 1);
            }
            System.out.println(t);
           // if(hashMap.t) System.out.println(word);
        }

        return answer;
    }
}
