import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean ans = false;
        for(int i=0;i<magazine.length();i++){
            String temp = magazine.substring(0,i+1);
            if(temp.equals(ransomNote))ans = true;
        }
        Map<Character,Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            hashMap1.put(Character.valueOf(ransomNote.charAt(i)), hashMap1.containsKey(ransomNote.charAt(i)) ? (hashMap1.get(ransomNote.charAt(i)) + 1) : 1);
        }
        Map<Character,Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            hashMap2.put(Character.valueOf(magazine.charAt(i)), hashMap2.containsKey(magazine.charAt(i)) ? (hashMap2.get(magazine.charAt(i)) + 1) : 1);
        }
        Iterator<Map.Entry<Character,Integer>> entries1 = hashMap1.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry<Character,Integer> entry = entries1.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }
        Iterator<Map.Entry<Character,Integer>> entries2 = hashMap2.entrySet().iterator();
        while (entries2.hasNext()) {
            Map.Entry<Character,Integer> entry = entries2.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }

        return ans;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
