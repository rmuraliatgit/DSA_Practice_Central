import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Long_Pressed_Name {
    public static void main(String[] args) {
        String name = "xnhtq";
        String typed = "xhhttqq";
        System.out.println(isLongPressedName(name, typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        Map<Character, Integer> hashtableForName = new HashMap<>();
        Map<Character, Integer> hashtableForTyped = new HashMap<>();
        if(name.charAt(name.length()-1)!=typed.charAt(typed.length()-1))return false;
        for (char ch : name.toCharArray())
            hashtableForName.put(ch, hashtableForName.containsKey(ch) ? (hashtableForName.get(ch) + 1) : 1);
        for (char ch : typed.toCharArray())
            hashtableForTyped.put(ch, hashtableForTyped.containsKey(ch) ? (hashtableForTyped.get(ch) + 1) : 1);
        int count=0;
        if(hashtableForName.size()==hashtableForTyped.size()){
            for (Map.Entry<Character, Integer> set : hashtableForName.entrySet()) {
                if(hashtableForTyped.get(set.getKey())>=set.getValue())count++;
            }
            if(count==hashtableForName.size())return true;
        }
        return false;
    }
}
