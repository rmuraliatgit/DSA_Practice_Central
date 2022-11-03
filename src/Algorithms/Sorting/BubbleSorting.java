package Algorithms.Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array ={9,8,7,6,5,4,3,2,1};
        //bubbleSorting(array);
        bubblle(array);
    }
    public static int[] bubbleSorting(int[] array){
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length -i; j++) {
                System.out.print(array[j]+" ");
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)break;
            System.out.println();
        }
        for (int i:array
             ) {
            System.out.print(i+" ");
        }




        return array;
    }
    public static int[] bubble(int[] array){

        boolean swapped ;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        for (int i:array
        ) {
            System.out.print(i + " ");
        }
        return array;
    }


    public static int[] bubblle(int[] array){
        boolean swapped ;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length-i; j++) {
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        for (int i:array
        ) {
            System.out.print(i + " ");
        }
        return array;
    }
}
