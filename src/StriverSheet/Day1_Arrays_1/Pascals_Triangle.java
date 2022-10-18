package StriverSheet.Day1_Arrays_1;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        pascals(5);
    }
    public static void pascals(int n){
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < n; i++) {
            row= new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0 || j==i)row.add(1);
                else{
                    row.add(pre.get(j)+pre.get(j-1));
                }
            }pre=row;answer.add(row);
        }
        System.out.println(answer.get(2));

    }
}
