import java.util.ArrayList;

public class Reverse_Only_Letters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        reverseOnlyLetters(s);
    }
    public static String reverseOnlyLetters(String s) {

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            if (((int) s.charAt(j) >= 65 && (int) s.charAt(j) <= 90)) {
                arrayList.add(s.charAt(j));
            } else if (((int) s.charAt(j) >= 97 && (int) s.charAt(j) <= 122)) {
                arrayList.add(s.charAt(j));
            }
        }
        int left = 0, right = arrayList.size()-1;
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                al.add(arrayList.get(right--));
            }
            else al.add(s.charAt(i));
        }
        String answer = "";
        int i = 0;
        for (char ss:al
             ) {
            answer+=al.get(i++);
        }
        System.out.println(answer);
        return answer;
    }
}
