package Medium.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Count_and_Say {
//    public static void main(String[] args) {
//        int n = 5;
//        countAndSays(n);
//    }
public static void main (String[] args) {

    char a = '5';
    char b = 65;
    int c = '1';
    int d = 'a';
    int e = 65;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);

}
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String answer = "";
        String temp = "21";
        Map<Character,Integer> hashMap = new HashMap<>();
        int flag = 1;
        String t = "";
        while(n>1){
            System.out.println("n:"+n+" temp: "+temp+ " "+temp.length());
            for (int i = 0; i < temp.length(); i++) {
                hashMap.put((temp.charAt(i)), hashMap.containsKey(temp.charAt(i)) ? (hashMap.get(temp.charAt(i)) + 1) : 1);
            }
            if(flag==1)temp="";
            else temp=temp;
            System.out.println(hashMap);
            Iterator<Map.Entry<Character,Integer>> entries = hashMap.entrySet().iterator();
            while (entries.hasNext()) {
                System.out.println("temp: "+temp);
                Map.Entry<Character,Integer> entry = entries.next();
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                temp+=String.valueOf(entry.getKey())+""+ String.valueOf(entry.getValue());
            }
            System.out.println("temp: "+temp);
            System.out.println("-------------------------------");
            n--;flag++;
        }
        answer= temp;
        System.out.println(answer);
        return answer;
    }
    public static String countAndSays(int n) {
        if (n == 1) return "1";
        String no = "1";

        String temp = "";
        for (int j = 1; j < n; j++) {
            Map<Character,Integer> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < no.length(); i++) {
                hashMap.put((no.charAt(i)), hashMap.containsKey(no.charAt(i)) ? (hashMap.get(no.charAt(i)) + 1) : 1);
            }
            System.out.println(hashMap);
            Iterator<Map.Entry<Character,Integer>> entries = hashMap.entrySet().iterator();

            while (entries.hasNext()) {
                System.out.println("temp: "+no);
                Map.Entry<Character,Integer> entry = entries.next();
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                temp+=String.valueOf(entry.getValue())+""+ String.valueOf(entry.getKey());
            }
            no = temp;
            temp="";
        }
        System.out.println(no);
        return "";
    }
}
