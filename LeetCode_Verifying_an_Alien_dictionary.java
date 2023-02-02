/*
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.

*/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] arr = new int[26];
        int seq = 0;
        for(char ch : order.toCharArray())
        {
            arr[ch-'a'] = seq++;
        }
        for(int i=0;i<words.length-1;i++)
        {
            String curr = words[i];
            String next = words[i+1];

            int len = Math.min(curr.length(),next.length());

            if(len != curr.length() && len == next.length() && curr.startsWith(next))
            {
                return false;
            }

            for(int l=0;l<len;l++)
            {
                if(arr[curr.charAt(l)-'a'] > arr[next.charAt(l)-'a'])
                {
                    return false;
                }
                if(arr[curr.charAt(l)-'a'] < arr[next.charAt(l)-'a'])
                {
                    break;
                }
            }
        }
        return true;
    }
}
