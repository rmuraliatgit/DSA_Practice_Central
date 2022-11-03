package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array){

        if(array.length == 1)return array;

            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(left);
            mergeSort(right);
           return merge(left,right);


    }
    public static int[] merge(int[] left, int[] right){
        int[] arr = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j < right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<right.length){
            arr[k]=right[i];
            j++;k++;
        }
        return arr;
    }
    public static void MergeSort(int[] array){
    int ans[] = new int[array.length];
        if(array.length>1){
            int mid = array.length/2;
            int[] left = Arrays.copyOfRange(array,0,mid);
            int[] right = Arrays.copyOfRange(array,mid,array.length);

            MergeSort(left);
            MergeSort(right);
            ans = Merge(left,right);
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int[] Merge(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];

        int l=0,r=0,k=0;

        while(l<left.length && r <right.length){
            if(left[l]<right[r]){
                ans[k] = left[l];
                l++;
            }
            else{
                ans[k] = right[r];
                r++;
            }
            k++;
        }
        while(l<left.length){
            ans[k]=left[l];
            k++;l++;
        }
        while(r<right.length){
            ans[k] = right[r];
            r++;k++;
        }

        return ans;
    }
}
