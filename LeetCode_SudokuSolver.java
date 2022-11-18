/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

 

Example 1:


Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:


 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit or '.'.
It is guaranteed that the input board has only one solution.
*/
class Solution {
    
    public boolean isSafe(char[][] sudoku,int row,int col,int num)
    {
        // row & column
        for(int i=0;i<sudoku.length;i++)
        {
            if(sudoku[i][col] == (char)(num + '0'))
            {
                return false;
            }
        }
        for(int j=0; j<sudoku.length; j++) {
           if(sudoku[row][j] == (char)(num+'0')) {
               return false;
           }
       }

        
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j] == (char)(num + '0'))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    public void solveSudoku(char[][] sudoku) {
        helper(sudoku,0,0);
    }
    
    
    public boolean helper(char[][] sudoku,int row,int col)
    {
        if(row == sudoku.length)
        {
            return true;
        }
        
        int Nrow = 0;
        int Ncol = 0;
        if(col != sudoku.length-1)
        {
            Nrow = row;
            Ncol = col+1;
        }
        else
        {
            Nrow = row+1;
            Ncol = 0;
        }
        if(sudoku[row][col] != '.')
        {
            if(helper(sudoku,Nrow,Ncol))
            {
                return true;
            }
        }
        else
        {
            for(int i=1;i<=9;i++)
            {
                if(isSafe(sudoku,row,col,i))
                {
                   sudoku[row][col] = (char)(i+'0');
                    if(helper(sudoku,Nrow,Ncol))
                    {
                        return true;
                    }
                    else
                    {
                       sudoku[row][col] = '.';
                    }
                }
               
            }   
        }
        return false;
    }
    
    
    
}
