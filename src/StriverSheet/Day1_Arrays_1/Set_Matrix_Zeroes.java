package StriverSheet.Day1_Arrays_1;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix={{0,1,1,0},{1,2,3,4},{1,2,3,4}};
        //bruteForce(matrix);
        optimal1(matrix);
    }
    public static int[][] bruteForce(int[][] matrix){
        int answer[][] = new int[matrix.length][matrix[0].length];
        int noOfZeros = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0)noOfZeros++;
            }
        }
        System.out.println(noOfZeros);
        int[][] indices = new int[noOfZeros][2];
        int t=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    System.out.println(i+","+j);
                    indices[t][0]=i;
                    indices[t][1]=j;
                    t++;
                }
            }
            System.out.println();
        }
        System.out.println(indices.length);
        int temp = 0;
        for (int k = 0; k < indices.length; k++) {
            System.out.println("asdf");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(indices[k][0]==i){
                        matrix[i][j]=0;
                    }
                    if(indices[k][1]==j) {
                        matrix[i][j] = 0;
                    }
                }
                System.out.println();
            }
        }
        //printing answer(matrix)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
    public static int[][] optimal1(int[][] matrix){

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;    // by default unassigned array element's value will be 0, so I am using -1 for identification
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i]==-1)matrix[i][j]=0;
                if(col[j]==-1)matrix[i][j]=0;
            }
        }

        //answer printing
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
}
