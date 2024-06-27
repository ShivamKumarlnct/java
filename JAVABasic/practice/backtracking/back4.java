package practice.backtracking;

public class back4 {
    public static boolean issafe(char board[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //right diagonal up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row){
        if(row==board.length){//base case
            printboard(board);
            count++;//count way of N queen
            return true;
        }

        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
            board[row][j]='Q';
            if(nQueen(board, row+1)){
                return true;
            };//function call
            board[row][j]='.';//backtracking
        }
    }
    return false;
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
          System.out.println();
        }
        System.out.println("-------------");
    }
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              board[i][j]= '.';
            }
        }
        nQueen(board,0);
        System.out.println("count the no of ways:" + count);//count total no of way 
    }
}
