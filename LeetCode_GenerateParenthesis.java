/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8

*/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        GenerateParenthesis(n,0,0,"",res);
        return res;
        
        
    }
     public static void GenerateParenthesis(int n,int open, int close,String ans,List<String> res)
    {
        if(open == n && close == n)
        {
            res.add(ans);
            // System.out.println(ans);
            return;
        }
        if(open < n)
        {
            GenerateParenthesis(n,open+1,close,ans+"(",res);

        }
        if(open>close)
        {
            GenerateParenthesis(n,open,close+1,ans+")",res);
        }


    }
}
