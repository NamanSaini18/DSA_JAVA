/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9
Accepted
488,820
Submissions
775,171
*/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];
        
        helper(board,list,0);
        return list;

    }
    public boolean isSafe(int row, int col,char[][] board)
    {
        // Horizontal
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i] == 'Q')
            {
                return false;
            }
        }
        
        // Vertical
        for(int j=0;j<board[0].length;j++)
        {
            if(board[j][col] == 'Q')
            {
                return false;
            }
        }
        // Upper left
        int r = row;
        for(int c = col;c>=0 && r>=0;c--,r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        // Upper Right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        
        // Lower left
        r = row;
        for(int c = col;c>=0 && r<board.length;r++,c--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
            
        }
        
        // Lower Right
        for(int c = col;c<board.length && r<board.length;c++,r++)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    
    public void saveBoard(char[][] board,List<List<String>> list)
    {
        String row = "";
        List<String> result = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            row= "";
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j] == 'Q')
                {
                    row += 'Q';
                }
                else
                {
                    row += '.';
                }
            }
             result.add(row);
        }
        list.add(result);
    }
    
    public void helper(char[][] board,List<List<String>> list,int col)
    {
        if(col == board.length)
        {
            saveBoard(board,list);
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col]='Q';
                helper(board,list,col+1);
                board[row][col] = '.';
            }
        }
    }
}
