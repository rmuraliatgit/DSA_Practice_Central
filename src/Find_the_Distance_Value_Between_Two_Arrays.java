import java.util.Arrays;

public class Find_the_Distance_Value_Between_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8}, arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) > d) {
                    System.out.print(Math.abs(arr1[i] - arr2[j]) + " " + (Math.abs(arr1[i] - arr2[j]) > d));
                    temp++;
                }
                System.out.println();
            }
            if (temp == arr2.length) answer++;
            System.out.println(answer + " " + temp);
        }
        return answer;
    }

    public static int findTheDistanceValueUsingBinarySearch(int[] arr1, int[] arr2, int d) {
        int start = 0, end = arr2.length - 1, answer = 0, temp =0;
        boolean loop = true;
        while(loop){
            int low = 0,high= arr2.length-1, mid = (low+high)/2;
            if(Math.abs(arr1[start] - arr2[mid]) > d){

            }

        }

        return answer;
    }
}
