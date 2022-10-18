package DS_Concepts;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {6,5,7,8,0,1,4,3,2,9};
        int find = 8;
        System.out.println(BinarySearch.findElementUsingBinarySearch(array,find));
    }
    public static int findElementUsingBinarySearch(int[] array, int key){
        Arrays.sort(array);   // For Binary search the array should be sorted (important point)
        int index = 0;
        int low =1,high = array.length;
        int mid = (high+low)/2;
        while(low<=high){

            if(key == array[mid])return mid;
            else if(key < array[mid])high= mid-1;
            else if(key > array[mid])low = mid+1;
            mid= (high+low)/2;
        }
        return -1;
    }
}
