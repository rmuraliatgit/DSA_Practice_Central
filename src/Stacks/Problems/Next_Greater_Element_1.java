package Stacks.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Next_Greater_Element_1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        List<Integer> l = new ArrayList<>();
        for (int i:nums2
             ) {
            l.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int index = l.indexOf(nums1[i]);
            System.out.println(index+":"+nums1[i]);
            Stack<Integer> stack = new Stack<>();
            for (int j = nums2.length-1; j >index; j--) {
                stack.push(nums2[j]);

            }System.out.println(stack +" stack size: "+stack.size());
            int size = stack.size();
            for (int k = 0; k <size; k++) {

                int peeked = stack.peek();
                System.out.println("peeked: "+peeked);
                if(nums1[i]<peeked){
                    ans.add(peeked);
                    System.out.println("added: "+ans.get(ans.size()-1));
                    break;
                }
                else{
                     int p = stack.pop();
                    System.out.println("after popped "+p);
                }
            }
            if(stack.size()==0)ans.add(-1);
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        System.out.println("list: "+ans);
        return answer;
    }

    public static void main(String[] args) {
      int[]  nums1 ={1, 3, 5, 2, 4}, nums2 = {6, 5, 4, 3, 2, 1, 7};
      nextGreaterElement(nums1,nums2);
    }
}
