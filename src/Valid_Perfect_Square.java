public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(perfectSquare(i));
    }
    public static boolean perfectSquare(int square){
        int temp = square/2;
        boolean ans = false;
        if(square == 1)return true;
        for (int i = 1; i <=temp; i++) {
            System.out.println(i*i+" "+square);
            if(i*i == square) ans = true;
        }
        return ans;
    }
}
