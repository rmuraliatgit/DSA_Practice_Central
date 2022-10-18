package Medium.Array;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1,2,3};int k = 3;
        subarraySum(nums,k);
    }
    public static int subarraySum(int[] nums, int k) {
        int answer = 0; int sum = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            sum = nums[i];
            if(sum == k) answer++;
            for(int j = i+1; j < n; j++){
                sum += nums[j];
                if(sum == k){
                    answer++;
                }
            }
        }
        System.out.println("answer: "+answer);
        return answer;
    }
}
