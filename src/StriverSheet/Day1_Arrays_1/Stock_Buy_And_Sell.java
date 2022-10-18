package StriverSheet.Day1_Arrays_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Stock_Buy_And_Sell {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        maxProfit(prices);
        optimal(prices);
    }
    public static int maxProfit(int[] prices) {
        int maximumProfit = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-prices[i]>temp) {
                    temp=prices[j]-prices[i];

                }
            }al.add(temp);

        }
        System.out.println(al);
        if(maximumProfit<=0)return 0;

        return maximumProfit;
    }
    public static int optimal(int[] prices){
        int[] xxx = prices.clone();
        Arrays.sort(xxx);
        if(Arrays.equals(xxx,prices)) {
            System.out.println("Equal");
            return prices[prices.length - 1] - prices[0];
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min)min=prices[i];
            if(prices[i]-min>0){
                max += prices[i]-min;
                al.add(max);
                ans+=max;
                min=Integer.MAX_VALUE;
            max=0;
            }
            Collections.sort(al);
        }
        System.out.println(ans);
        return max;
    }
}
