package Backtracking;

public class NQueens {
    int ans;
    public int totalQueens(int n){
        char board[][]= new char[n][n];
        for(char[] row: board){
            Arrays.fill(row,'.');
        }
        nQueens(board,0,n);
        return ans;
    }
    public void nQueens(char[][] board, int row, int n){
        if(row==n){
            ans++;
            return;
        }
        for(int col=0; col<n ;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                nQueens(board, row+1, n);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char board[][], int row, int col, int n){
        //top
        for(int r=0; r<row; r++){
            if(board[r][col]=='Q'){
                return false;
            }
        }
        //top right
        for(int r=row-1, c=col+1; r>=0 && c<n ; r--, c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //top left
        for(int r=row-1, c=col-1; r>=0 && c>=0 ; r--, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
}
