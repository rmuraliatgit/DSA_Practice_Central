public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        transpose(matrix);
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] answer = null;
        if(matrix.length==matrix[0].length){
            answer = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(i==j){
                        answer[i][j]= matrix[i][j];
                    }
                    if(i!=j){
                        answer[i][j] = matrix[j][i];
                    }
                }
            }
        }
        else {
            answer = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++) {
                    if(i==j)answer[i][j] =  matrix[i][j];
                    if(i!=j)answer[i][j] = matrix[j][i];
                }
            }
        }
        System.out.println(matrix.length+" "+matrix[0].length+" "+ answer.length+" "+answer[0].length);
        return answer;
    }
}
