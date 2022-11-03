package Algorithms.Sorting;

import java.util.List;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] array = {5,4,2,3,6,1};
        array = insertionSort(array);
        for (int x:array) {
            System.out.print(x+" ");
        }
        System.out.println();
        array = insertionn(array);
        for (int x:array) {
            System.out.print(x+" ");
        }
    }
    public static void swap(int[] array,int j,int k){
        int temp = array[k];
        array[k] = array[j];
        array[j]= temp;
    }
    public static int[] insertionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(array[j]<array[j-1]) {
                   swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
    public static int[] insertion(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j]= temp;
                }
            }
        }
        return array;
    }
    public static int[] insertionn(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
            }
        }return arr;
    }
}
