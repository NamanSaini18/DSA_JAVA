// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.

class Solution {
    public String longestPalindrome(String str) {
        
        String answer = getanswer(str);
        
        int length = 2 * str.length() + 1;
        
        int[] p = new int[length];      
        int c = 0;        
        int r = 0;
        int maxLength = 0;
        
        int position = -1;
        for (int i = 0; i < length; i++) {
            int mirror = 2 * c - i;
            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);
            }
             int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);
            while (a < length && b >= 0 && answer.charAt(a) == answer.charAt(b)) {
                p[i]++;
                a++;
                b--;
            }
             if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
            if (maxLength < p[i]) {
                maxLength = p[i];
                position = i;
            }
        }
        int offset = p[position];
        StringBuilder result = new StringBuilder();
        for (int i = position - offset + 1; i <= position + offset - 1; i++) {
            if (answer.charAt(i) != '#') {
                result.append(answer.charAt(i));
            }
        }
        return result.toString();
    }

    private String getanswer(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append("#").append(str.charAt(i));
        }
        sb.append("#");
        return sb.toString();
    }
}
