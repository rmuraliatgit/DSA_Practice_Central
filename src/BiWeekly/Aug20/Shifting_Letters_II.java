package BiWeekly.Aug20;

public class Shifting_Letters_II {
    public static void main(String[] args) {
       String s = "abc";int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
       shiftingLetters(s,shifts);
    }
    public static String shiftingLetters(String s, int[][] shifts) {
        String answer = "";
        String temp = s;
        for (int i = 0; i < shifts.length; i++) {
            String t = "";
            int start = shifts[i][0];
            int end = shifts[i][1];
            int dir = shifts[i][2];
            for (int j = start; j <=end; j++) {
                char c= s.charAt(j);
                System.out.println((int)c);
                if(dir==1){
                    int xx = (int)c+1;
                    System.out.println(xx);
                    char cc =(char)xx;
                    System.out.println(cc);
                    t+=cc;
                }
                else{
                    int xx = (int)c-1;
                    if(xx<97)xx=122;
                    System.out.println(xx);
                    char cc =(char)xx;
                    System.out.println(cc);

                    t+=cc;
                }
                s=t+s.substring(end);

            }
            System.out.println(s);
        }



        return answer;
    }
}
