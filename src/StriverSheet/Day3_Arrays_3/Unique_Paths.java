package StriverSheet.Day3_Arrays_3;

public class Unique_Paths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        uniquePaths(m,n);
    }
    public static int uniquePaths(int m, int n) {
        int answer = 1;
        int N =  m+n-2;
        int r = m-1;
        for (int i = 1; i <=r; i++) {
            answer = answer * ( N -r +i)/i;
        }

        System.out.println(answer);

        return (int)answer;
    }
}
