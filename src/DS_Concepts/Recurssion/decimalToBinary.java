package DS_Concepts.Recurssion;

public class decimalToBinary {
    public static void main(String[] args) {
        System.out.print(toBinary(21));
    }
    public static int toBinary(int n){
        if(n==0)return 1;
        return n%2 + (10 * (toBinary(n/2)));
    }
}
