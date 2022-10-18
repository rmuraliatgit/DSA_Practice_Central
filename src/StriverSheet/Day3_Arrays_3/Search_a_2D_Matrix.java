package StriverSheet.Day3_Arrays_3;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};int target = 3;
        //searchMatrix(matrix,target);
        optimal(matrix,target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean answer = false;
        int index = -1;
        for (int i = 0; i <matrix.length; i++) {
            if(matrix[i][0]<target){
                index = i;
                break;
            }
            else if(target==matrix[i][0])return true;
        }
       System.out.println(index);
        for (int i = 0; i < matrix[index].length; i++) {
            if(target==matrix[index][i])return true;
        }
        return answer;
    }
    public static boolean optimal(int[][] matrix,int target){

        int pointer = matrix[0][matrix[0].length-1];

        int low = 0, high = (matrix.length*matrix[0].length)-1;
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println(pointer+" "+high);

        while(low<=high){
            int mid = (low + (high-low)/2);
            if(matrix[mid/m][mid%m]==target)return true;
            if(matrix[mid/m][mid%m]<target)low = mid + 1;
            else high = mid -1;
        }


        return false;
    }
}
