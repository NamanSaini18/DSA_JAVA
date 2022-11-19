/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
*/

class Solution 
{
    int res;
    public int totalNQueens(int n) {
        
        res = 0;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        
        NQueens(board, 0, n);
        return res;
    }
    
    public void NQueens(char[][] board, int row, int n){
        
        
        if(row == n)
        {
            res++; 
            return;
        }
        
        for(int col = 0; col < n ; col++){
            if (isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                NQueens(board, row+1, n);
                board[row][col] = '.';
            }
        }
    }
    
    public boolean isSafe(char[][] board, int row, int col, int n){

        // check column
        for (int i = row; i >= 0; i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        // check upper diagonal 
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
