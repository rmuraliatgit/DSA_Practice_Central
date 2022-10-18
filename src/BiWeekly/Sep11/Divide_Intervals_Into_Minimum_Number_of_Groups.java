package BiWeekly.Sep11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Divide_Intervals_Into_Minimum_Number_of_Groups {
    public static void main(String[] args) {
        int[][] intervals = {{5,10},{6,8},{1,5},{2,3},{1,10}};
        System.out.println(minGroups(intervals));
    }
    public static int minGroups(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prevEnd = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (prevEnd > intervals[i][0]) {
                count++;
                prevEnd = Math.min(intervals[i][1], prevEnd);
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}
