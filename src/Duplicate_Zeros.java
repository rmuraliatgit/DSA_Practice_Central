import java.util.ArrayList;

public class Duplicate_Zeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)arrayList.add(arr[i]);
            else {
                arrayList.add(0);
                arrayList.add(0);
            }
        }
        System.out.println(arrayList);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arrayList.get(i);
        }
    }
}
