/*
You are given a tree (i.e. a connected, undirected graph that has no cycles) rooted at node 0 consisting of n nodes numbered from 0 to n - 1. The tree is represented by a 0-indexed array parent of size n, where parent[i] is the parent of node i. Since node 0 is the root, parent[0] == -1.

You are also given a string s of length n, where s[i] is the character assigned to node i.

Return the length of the longest path in the tree such that no pair of adjacent nodes on the path have the same character assigned to them.

 

Example 1:


Input: parent = [-1,0,0,1,1,2], s = "abacbe"
Output: 3
Explanation: The longest path where each two adjacent nodes have different characters in the tree is the path: 0 -> 1 -> 3. The length of this path is 3, so 3 is returned.
It can be proven that there is no longer path that satisfies the conditions. 
Example 2:


Input: parent = [-1,0,0,0], s = "aabc"
Output: 3
Explanation: The longest path where each two adjacent nodes have different characters is the path: 2 -> 0 -> 3. The length of this path is 3, so 3 is returned.
 

Constraints:

n == parent.length == s.length
1 <= n <= 105
0 <= parent[i] <= n - 1 for all i >= 1
parent[0] == -1
parent represents a valid tree.
s consists of only lowercase English letters.
*/
class Solution {
     int val = 1; 

    public int longestPath(int[] arr, String str)
    {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 1; i < arr.length; i++){
            int j = arr[i];
            map.putIfAbsent(j, new LinkedList<>());
            map.get(j).add(i);
        }
        
        DFS(0, map, str);
        return val;
    }

    public int DFS(int node, Map<Integer, List<Integer>> map, String str)
    {
        if(!map.containsKey(node)) 
        {
            return 1;
        }
        int max = 0, sMax = 0;
        
        for(int item : map.get(node)){
            int longest = DFS(item , map, str);
            if(str.charAt(node) == str.charAt(item)) 
            {
                continue;
            }
            
            if(longest > max){
                sMax = max;
                max = longest;
            }
            else if(longest > sMax)
            {
                sMax = longest;
            }
        }
        val = Math.max(val, max+sMax+1);
        return max+1;
    }
}
