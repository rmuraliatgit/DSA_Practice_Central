import java.util.Arrays;

public class Largest_Number_At_Least_Twice_of_Others {
    public static void main(String[] args) {
        int arr[] = {1,0};
        System.out.println(dominantIndex(arr));
    }
    public static int dominantIndex(int[] nums) {
        int index = -1,flag =-1;
        int[] temp = Arrays.stream(nums).toArray();
        Arrays.sort(temp);
        int max = temp[temp.length-1];
        for (int i = 0; i < temp.length; i++) {
            if(max>=(2*temp[temp.length-2]))flag++;
        }
        if(flag==nums.length-1){
            for (int i = 0; i < nums.length; i++) {
                if(max == nums[i]){
                    index = i;break;
                }
            }
        }
        else return -1;
        return index;
    }
}
