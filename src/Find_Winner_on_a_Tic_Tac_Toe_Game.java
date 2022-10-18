public class Find_Winner_on_a_Tic_Tac_Toe_Game {
    public static void main(String[] args) {

    }
    public static  String tictactoe(int[][] moves) {
        String str = "";
        for (int i = 0; i < moves.length; i++) {
            int count = 0;
            for (int j = 0; j < moves[i].length; j++) {
                if(i==j)count++;

            }
            if(count==3 && moves.length%2!=0){
                str = "A";
                break;
            }
            else if(count==3 && moves.length%2==0){
                str="B";
                break;
            }
        }
        for (int i = 0; i < moves.length; i++) {
            int count = 0;
            for (int j = 0; j < moves[i].length; j++) {
                if(i==j)count++;

            }
            if(count==3 && moves.length%2!=0){
                str = "A";
                break;
            }
            else if(count==3 && moves.length%2==0){
                str="B";
                break;
            }
        }



        return str;
    }
}
