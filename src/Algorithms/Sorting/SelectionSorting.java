package Algorithms.Sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        selectionSort(array);
    }
    public static int[] selectionSort(int[] array){
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min])min = j;
            }
            if(min!=i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        for (int i:array
        ) {
            System.out.print(i + " ");
        }
        return array;
    }
}
