import java.util.ArrayList;

public class Available_Captures_for_Rook {
    public static void main(String[] args) {
    char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
    numRookCaptures(board);
    }
    public static int numRookCaptures(char[][] board) {
        int answer = 0;
        int[] RIndex = new int[2];
        int Bcount =0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length;j++) {
                if(board[i][j]=='R'){
                    Bcount++;
                }
            }
        }  
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='R'){
                    RIndex[0]=i;
                    RIndex[1]=j;
                }
            }
        }
        int[][] BIndex = new int[Bcount][2];
        int s=0,t=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='B'){
                    System.out.println("Hello"+s+" "+t);
                    t=0;
                    BIndex[s][t]=i;
                    BIndex[s][t+1]=j;
                    s++;
                }
            }
        }
        for (int x:RIndex
             ) {
            System.out.print(x+"-");
        }
        System.out.println();
        for (int i = 0; i < BIndex.length; i++) {
            for (int j = 0; j < BIndex[i].length; j++) {
                System.out.print(BIndex[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if((i==RIndex[0] || j==RIndex[1]) && board[i][j]=='p'){
                        //System.out.println(i+" "+j);
                        answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
