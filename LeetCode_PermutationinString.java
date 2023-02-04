/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
*/
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put (ch, map.getOrDefault(ch,0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            
            String str = s2.substring(i, i + s1.length());

            for (char ch : str.toCharArray()) {
                map2.put (ch, map2.getOrDefault(ch, 0) + 1);
            }
            
            if (map.equals(map2)) return true;
            else map2.clear();
        }
        return false;
    }
}
