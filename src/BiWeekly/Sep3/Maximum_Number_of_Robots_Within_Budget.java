package BiWeekly.Sep3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Maximum_Number_of_Robots_Within_Budget {
    public static void main(String[] args) {

        int[] chargeTimes = {3,6,1,3,4}, runningCosts = {2,1,3,4,5};int budget = 25;
        maximumRobots(chargeTimes,runningCosts,budget);

    }
    public static int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int maxRobots = 0;
        int flag=0;
        int maxx =Integer.MIN_VALUE;
        for (int i = 0; i < chargeTimes.length; i++) {
            int bud =0;
            List<Integer> list=new ArrayList<>();
            int sum = 0;
            for (int j = 0; j <=i; j++) {
                list.add(chargeTimes[j]);
                sum+=runningCosts[j];
            }
            int max= Collections.max(list);
            bud=max+(list.size()*sum);
            if(bud<=budget)flag++;
            else break;

        }
        System.out.println(flag);
        return flag;
    }
}
