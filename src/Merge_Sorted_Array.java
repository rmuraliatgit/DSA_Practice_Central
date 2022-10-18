import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,7,0,0,0};
        int[] array2 = {2,5,6};
        merge(array1,6,array2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            al.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            al.add(nums2[i]);
        }
        Collections.sort(al);
        System.out.println(al);

    }
    public static void twoPointerToMergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums2[j]>=nums1[i]){
                nums1[k]=nums2[j];
                j--;k--;
            }
            else if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        while (i>=0){
            nums1[k]=nums1[i];
            k--;i--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;j--;
        }
        for (int x:nums1
             ) {
            System.out.print(x+" ");
        }
    }

}
