public class Find_the_Middle_Index_in_Array {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        findMiddleIndex(nums);
    }
    public static int findMiddleIndex(int[] nums) {
        int answer = -1;

        for (int i = 0; i < nums.length-1; i++) {
            int left = 0,right=0;

            for (int j = 0; j < i; j++) {
                left+=nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                right+=nums[j];
            }
            if(left==right)return i;
        }
        return answer;
    }
}
