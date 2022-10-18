package DS_Concepts.Recurssion;

public class recursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(10));
    }
    public static int recursiveRange(int num) {
        //  TODO
        if(num==1)return 1;
        return num+recursiveRange(num-1);
    }
}
