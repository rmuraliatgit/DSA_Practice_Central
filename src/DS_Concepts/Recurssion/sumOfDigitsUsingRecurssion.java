package DS_Concepts.Recurssion;

public class sumOfDigitsUsingRecurssion {
    public static void main(String[] args) {
        System.out.println("ans : "+sumOfDigits(3987));
        System.out.println("power : "+powerOfN(2,3));
    }
    public static int sumOfDigits(int n){
        int ans = 0;
        if(n==0)return 0;
        else ans =  n%10+sumOfDigits(n/10);
        return ans;
    }
    public static int powerOfN(int base , int power){
        if(power==1)return base;
        if(power==0)return 1;
        else return base * powerOfN(base,power-1);
    }
}
