package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        mergeSort(array);
        //System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array){
        if(array.length > 1) {


            int mid = array.length / 2;

            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(left);
            mergeSort(right);
            merge(left,right);
        }


    }
    public static void merge(int[] left, int[] right){
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
        for (int ii:arr
             ) {
            System.out.print(ii+" ");
        }
    }
}
