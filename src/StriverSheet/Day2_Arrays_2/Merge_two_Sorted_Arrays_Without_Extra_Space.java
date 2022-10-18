package StriverSheet.Day2_Arrays_2;

import java.util.Arrays;

public class Merge_two_Sorted_Arrays_Without_Extra_Space {
    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        System.out.println("Before merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
    public static void two_pointer_method(int[] nums1, int m, int[] nums2, int n) {
        int k;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]>nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
                Arrays.sort(nums2);
            }
        }
        int first = nums2[0];
        // insertion sort is used here
        for (k = 1; k < m && nums2[k] < first; k++) {
            nums2[k - 1] = nums2[k];
        }
        nums2[k - 1] = first;
        int kk=0;
        for (int i = m; i < nums1.length ; i++) {
            nums1[i] = nums2[kk];kk++;
        }
        for (int i :nums1
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:nums2
             ) {
            System.out.print(i+" ");
        }
    }
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static void merge(int ar1[], int ar2[], int n, int m) {
        // code here
        int gap =(int) Math.ceil((double)(n + m) / 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (n + m)) {
                if (j < n && ar1[i] > ar1[j]) {
                    swap(ar1[i], ar1[j]);
                } else if (j >= n && i < n && ar1[i] > ar2[j - n]) {
                    swap(ar1[i], ar2[j - n]);
                } else if (j >= n && i >= n && ar2[i - n] > ar2[j - n]) {
                    swap(ar2[i - n], ar2[j - n]);
                }
                j++;
                i++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap =(int) Math.ceil((double) gap / 2.0);
            }
        }
    }
}
