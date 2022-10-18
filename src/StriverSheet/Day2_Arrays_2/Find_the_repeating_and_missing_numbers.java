package StriverSheet.Day2_Arrays_2;

import java.util.Arrays;
import java.util.TreeMap;

public class Find_the_repeating_and_missing_numbers {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 3,};
        repeating_missing(array);
    }
    public static int[] repeating_missing(int[] array){
        int answer[] = new int[2];
        int temp[] = new int[array.length+1];
        Arrays.sort(array);
        Arrays.fill(temp,-1);
        for ( int i = 0; i <array.length; i++) {
            if(temp[array[i]]==1)temp[array[i]]=temp[array[i]]+1;
            else temp[array[i]]=1;
        }
        int missing = 0, duplicate = 0;
        for (int i = 1; i < temp.length; i++) {
            if(temp[i]==-1)missing = i;
            if(temp[i]>1)duplicate = i;
        }
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        
        System.out.println("missing: "+missing+" duplicate: "+duplicate);
        return temp;
    }
}
