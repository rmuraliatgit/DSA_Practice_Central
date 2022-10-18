package StriverSheet.Day3_Arrays_3;

public class Pow__x_n__ {
    public static void main(String[] args) {
        double x = 2.0000;
        int n = -2;
        myPow(x,n);
    }
    public static double myPow(double x, int n) {
        double answer = 1.0 ;
        long power = n;
        System.out.println(power);
        if (power < 0) power = -1 * power;
        System.out.println(power);
        while(power>0){
            if(power%2==1){
                answer = answer * x;
                power = power -1;
            }
            else{
                x= x*x;
                power = power / 2;
            }
        }

        if(n<0) answer = (double)(1.0)/(double)(answer);
        System.out.println(answer+" "+n);
        return answer;
    }
}
