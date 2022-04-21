// Given a binary tree, find its level order traversal.
// Level order traversal of a tree is breadth-first traversal for the tree.


// Example 1:

// Input:
//     1
//   /   \ 
//  3     2
// Output:1 3 2
// Example 2:

// Input:
//         10
//      /      \
//     20       30
//   /   \
//  40   60
// Output:10 20 30 40 60

// Your Task:
// You don't have to take any input. Complete the function levelOrder() that takes the root node as 
//   input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)


// Constraints:
// 1 ≤ Number of nodes ≤ 105
// 1 ≤ Data of a node ≤ 105

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> tree = new ArrayList<>();
        if(node == null)
        {
            return new ArrayList<Integer>();
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        
        while(!queue.isEmpty())
        {
            for(int i=1;i<=queue.size();i++)
            {
                Node temp = queue.poll();
                tree.add(temp.data);
                
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
        return tree;
    
    }
}
