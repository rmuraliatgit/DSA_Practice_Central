import java.util.Arrays;

public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int arr[] = {-2,4,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length-1; k++) {
                if(j!=k && arr[j]==(2*arr[k])) {
                    return true;
                }
            }
        }

        return false;
    }
}
