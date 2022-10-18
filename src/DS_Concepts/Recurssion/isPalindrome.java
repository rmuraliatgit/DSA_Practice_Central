package DS_Concepts.Recurssion;

public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome("mALAYALAM");
    }
    public static boolean isPalindrome(String s)
    {
        if(s.length()==0)return true;
        if(!(s.charAt(0)==s.charAt(s.length()-1)))return false;
        else return isPalindrome(s.substring(1,-1));
    }
}
