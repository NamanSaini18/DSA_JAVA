/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.
*/

class Solution {
    public String frequencySort(String s) {
        char str[] = s.toCharArray();
    	
        Map<Character, Integer> map = new HashMap<>();
    	int i,max=0;
    	for(i=0;i<str.length;i++)
    	{
    		map.put(str[i], map.getOrDefault(str[i], 0)+1);
    		max=Math.max(max, map.get(str[i]));
    	}
    	
        List<Character> list[]=new ArrayList[max+1];
    	for(i=1;i<=max;i++)
    		list[i]=new ArrayList<>();
    	for(Character ch : map.keySet())
    		list[map.get(ch)].add(ch);
    	
        StringBuilder ans=new StringBuilder();
    	for(i=max;i>0;i--)
    	{
    		if(list[i].size()==0)
    			continue;
    		for(Character ch : list[i])
    		for(int j=0;j<i;j++)
    			ans.append(ch);
    	}
    	
        return ans.toString();
    }
}
