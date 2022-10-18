public class Check_if_Matrix_Is_X_Matrix {
    public static void main(String[] args) {
        int[][] grid ={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.print(checkXMatrix(grid));
    }
    public static boolean checkXMatrix(int[][] grid) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i==j && grid[i][j]==0){
                    return false;
                }
                 if(i+j==grid[i].length-1 && grid[i][j]==0 ){
                   return false;
                }
                 if(i!=j && i+j != grid[i].length-1 && grid[i][j]!=0){
                     return false;
                 }
                 else count++;
            }
        }

        System.out.println(count);
        int indexCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                indexCount++;
            }
        }
        System.out.println(indexCount);
        if(count==indexCount)return true;
        else return false;

    }
}
/*
   0123

 0 5001
 1 0415
 2 0520
 3 4102


 */