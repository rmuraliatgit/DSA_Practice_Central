package StriverSheet.Day2_Arrays_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Overlapping_Sub_intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{5,10},{15,18}};
        merge(intervals);
    }
    public static int[][] merge(int[][] intervals) {
        int[][] answer = new int[3][2];
        List<int[]> ans = new ArrayList<>();
        int k =1;
        if(intervals.length==0 || intervals == null){
            return ans.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i:intervals
             ) {
            if(end>= i[0]){
                end = Math.max(end,i[1]);
            }
            else{
                ans.add(new int[]{start,end});

                start =i[0];
                end=i[1];

            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);
    }
    public static int[][] optimal(int[][] array){
        List<int[]> answer = new ArrayList<>();
        Arrays.sort(array,(a,b) ->a[0]-b[0]);
        int[] temp = array[0];

        for (int i = 1; i < array.length; i++) {
            if(temp[1]>array[i][0]){
                temp[1] = Math.max(array[i][1],temp[1]);
            }
            else{
                answer.add(temp);
                temp = array[i];
            }
        }
        answer.add(temp);

        return answer.toArray(new int [0][]);
    }
}
