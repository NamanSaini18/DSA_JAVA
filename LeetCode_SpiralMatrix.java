/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List res = new ArrayList<>();
        int minr = 0;
        int maxr = matrix.length-1;
        int minc = 0;
        int maxc = matrix[0].length-1;
        int ctr= 0;
        int total = matrix.length * matrix[0].length;
        while(ctr < total)
        {
            for(int i=minc;i<=maxc && ctr<total;i++)
            {
                res.add(matrix[minr][i]);
                ctr++;
            }
            minr++;
            for(int i=minr;i<=maxr && ctr<total;i++)
            {
                res.add(matrix[i][maxc]);
                ctr++;
            }
            maxc--;
            for(int i=maxc;i>=minc && ctr<total;i--)
            {
                res.add(matrix[maxr][i]);
                ctr++;
            }
            maxr--;
            for(int i=maxr;i>=minr && ctr<total;i--)
            {
                res.add(matrix[i][minc]);
                ctr++;
            }
            minc++;
        }
        return res;
    }
}
