package BiWeekly.Aug20;

import java.util.HashMap;

public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static void main(String[] args) {
       String blocks = "WBBWWBBWBW"; int k = 7;
        System.out.println(minimumRecolors(blocks,k));
    }
    public static int minimumRecolors(String blocks, int k) {
        String tem = "";
        for (int i = 0; i < k; i++) {
            tem+="B";
        }
        if(blocks.contains(tem))return 0;
        String temp = "";
        int count = 0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <=blocks.length()-k; i++) {

            temp = blocks.substring(i,i+k);
            System.out.println(temp);
            int t = 0;
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j)=='W'){
                    t++;
                }
            }
            if(min>t) {
                min = t;
            }
            System.out.println(min+" "+t);
        }
        return min;
    }
}
