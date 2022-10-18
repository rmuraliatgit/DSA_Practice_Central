package Medium.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
       int[] nums = {1,2,2}; int target = 2;
        searchRange(nums,target);
        int [] array= {9,8,7,6,5,4,3,2,1};
        insertionSort(array);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[]  answer = new int[2];
        if(nums.length==1 && nums[0]!=target){
            answer[0]=-1;
            answer[1]=-1;
            return answer;
        }
        answer[0]=-1;
        answer[1]=-1;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.containsKey(nums[i])?(hashMap.get(nums[i])+1):1);
        }
        if(hashMap.size()==1 && target==nums[0]){
            answer[0]=0;
            answer[1]=nums.length-1;
            return answer;
        }else {
            answer[0] = -1;
            answer[1] = -1;
        }
        System.out.println("Hello");
        int low =0,high = nums.length-1;
        int x = 0;
        int mid = (high+low)/2;
        ArrayList<Integer> xxx = new ArrayList<>();
        int s=0;
        while(low<=high){
//            System.out.println(low+" "+high);
//            if(nums[low]==target){
//                answer[x]=low;
//                low++;x++;
//            }
//            else low++;
//            if(nums[high]==target){
//                answer[x]=high;
//                high--;
//                x++;
//            }
//            else high--;
            if(target == nums[mid])answer[s]=mid;
            else if(target < nums[mid])high= mid-1;
            else if(target > nums[mid])low = mid+1;
            mid= (high+low)/2;s++;
        }
        System.out.println(xxx);
        if(answer[0]!=-1 && answer[1]!=-1)Arrays.sort(answer);
        if(answer[0]!=-1 && answer[1]==-1)answer[1]=answer[0];
        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }
    public static void insertionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        for (int x:array
             ) {
            System.out.print(x+" ");
        }
    }
}
