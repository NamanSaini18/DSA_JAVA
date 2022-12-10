/*
Given a number k and string num of digits (0 to 9) denoting a positive integer. Find a string denoting the lowest integer number possible by removing k digits from num, without changing their order.
Note: num will not contain any leading zero.

 

Example 1:

Input:
k = 2
num = "143729"
Output: "1329"
Explanation: 1329 is the minimum number
possible after removing '4' and '7'.
 

Example 2:

Input:
k = 3
num = "10056"
Output: "0"
Explanation: 0 is the minimum number
possible after removing '1' , '5' and '6'.
 

Your Task:  
You dont need to read input or print anything. Complete the function buildLowestNumber() which accepts string num and integer k as input parameters and returns a string denoting the smallest integer possible after removing k digits from num without changing the order.


Expected Time Complexity: O(Length of num) 
Expected Auxiliary Space: O(Length of num) 


Constraints:
1 <= Length of num <= 105
0 <= k < Length of num

*/
class Solution {
    // Time Complexity :- O(num.length);
    // Space Complexity :- O(num.length);
    static String buildLowestNumber(String str, int N) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            while(stack.size()>0 && stack.peek()>c && N>0) {
                N--;
                stack.pop();
            }
            stack.push(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0) {
            char c = stack.pop();
            if(N>0) {
                N--;
                continue;
            }
            sb.append(Character.toString(c));
        }
        
        String ans = sb.reverse().toString();
        for(int i=0;i<ans.length();i++) {
            if(ans.charAt(i)!='0') return ans.substring(i);
        }
        return "0";
    }
}

  
