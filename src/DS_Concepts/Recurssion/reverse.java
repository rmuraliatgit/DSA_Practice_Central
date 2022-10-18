package DS_Concepts.Recurssion;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse("Murali"));
    }
    public static String reverse(String str) {
        int n = str.length();
        String temp = "";
        if (str.length() == 0) return "";
        if (str.length() == 1) return String.valueOf(str.charAt(0));
        else {
            temp += str.charAt(n-1)+reverse(str.substring(0,n-1));
        }
        return temp;
    }
}