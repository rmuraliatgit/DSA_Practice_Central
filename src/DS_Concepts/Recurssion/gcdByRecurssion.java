package DS_Concepts.Recurssion;

public class gcdByRecurssion {
    public static void main(String[] args) {
        System.out.println(gcd(48,12));
    }
    public static int gcd(int a, int b){
        if(a<0 || b<0)return -1;
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
