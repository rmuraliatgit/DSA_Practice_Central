public class Keep_Multiplying_Found_Values_by_Two {
    public static void main(String[] args) {
        int[] arr = {2,7,9};
        int original = 4;
        System.out.println("ans: "+findFinalValue(arr, original));
    }
    public static int findFinalValue(int[] nums, int original) {
        int ans = original;
        int loop = 1;
        while(loop<=nums.length){
            for (int i = 0; i < nums.length; i++) {
                 if(ans == nums[i]) {
                     System.out.println(ans);
                     ans = nums[i] * 2;
                     System.out.println(ans);
                 }
            }loop++;
        }



        return ans;
    }
}
