package StriverSheet.Day3_Arrays_3;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        int count = 0 , element = 0;
        for (int i:nums
             ) {
            if(count==0){
                element = i;
            }
            if(i == element)count++;
            else count--;
        }
        return element;
    }
}
