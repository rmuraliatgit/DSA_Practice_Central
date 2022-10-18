import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public static void main(String[] args) {
    int[] nums = {0,1,2,4,5,7};
    summaryRanges(nums);
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();

        int start = nums[0], end = 0;
        for (int i = 0; i < nums.length-1; i++) {

            int temp = nums[i];
            while(temp+1 == nums[i+1]){
                end = nums[i+1];
            }
            System.out.println("start: "+start+" end: "+end);
//            else{
//                answer.add("\""+nums[i]+"\"");
//                start = nums[i+1];
//            }
        }





        return answer;
    }
}
