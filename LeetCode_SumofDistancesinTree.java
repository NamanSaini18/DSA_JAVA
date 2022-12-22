/*
There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.

You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.

Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.

 

Example 1:


Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
Explanation: The tree is shown above.
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.
Hence, answer[0] = 8, and so on.
Example 2:


Input: n = 1, edges = []
Output: [0]
Example 3:


Input: n = 2, edges = [[1,0]]
Output: [1,1]
 

Constraints:

1 <= n <= 3 * 104
edges.length == n - 1
edges[i].length == 2
0 <= ai, bi < n
ai != bi
The given input represents a valid tree
*/
class Solution {
    int[] arr, ctr;
    ArrayList<HashSet<Integer>> list;
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        list = new ArrayList<HashSet<Integer>>();
        arr = new int[N];
        ctr = new int[N];
        for (int i = 0; i < N ; ++i)
            list.add(new HashSet<Integer>());
        for (int[] e : edges) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }
        DFS(0, -1);
        DFS2(0, -1);
        return arr;
    }

    public void DFS(int root, int answer) {
        for (int i : list.get(root)) {
            if (i == answer) 
            {
                continue;
            }
            DFS(i, root);
            ctr[root] += ctr[i];
            arr[root] += arr[i] + ctr[i];
        }
        ctr[root]++;
    }


    public void DFS2(int root, int answer) {
        for (int i : list.get(root)) {
            if (i == answer)
            {
                continue;
            } 
            arr[i] = arr[root] - ctr[i] + ctr.length - ctr[i];
            DFS2(i, root);
        }
    }
}
