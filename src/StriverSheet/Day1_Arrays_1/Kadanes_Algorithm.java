package StriverSheet.Day1_Arrays_1;

import java.util.ArrayList;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> subarray=new ArrayList<>();
        int lon=kadane(arr,subarray);
        System.out.println("The longest subarray with maximum sum is "+lon);
        System.out.println("The subarray is ");
        for(int i=subarray.get(0);i<=subarray.get(1);i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int kadane(int[] nums, ArrayList<Integer> subarray){
        int msf=Integer.MIN_VALUE , meh=0 ;
        int s=0;
        for(int i=0;i<nums.length;i++){
            meh+=nums[i];

            if(meh>msf)
            {
                subarray.clear();
                msf=meh;
                subarray.add(s);
                subarray.add(i);
            }
            if(meh<0)
            {
                meh=0;
                s=i+1;

            }
        }

        return msf;
    }
}
