package StriverSheet.Day2_Arrays_2;

import java.util.ArrayList;
import java.util.List;

public class Rotate_Image_by_90_degree {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        optimal(matrix);
    }

    public static void rotate(int[][] matrix) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> a = null;
        for (int i = 0; i < matrix.length; i++) {
            int loop = matrix.length - 1;
            a = new ArrayList<>();
            while (loop >= 0) {
                a.add(matrix[loop][i]);
                loop--;
            }
            al.add(a);
        }
        //System.out.println(al);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.print(al.get(i).get(j));
                matrix[i][j] = al.get(i).get(j);
            }
            System.out.println();
        }
    }

    public static void optimal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[j][i] ;
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int a =0,b = matrix[i].length-1;
            for (int j = 0; j <=matrix[i].length/2; j++) {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}