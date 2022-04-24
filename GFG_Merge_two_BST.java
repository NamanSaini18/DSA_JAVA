// Given two BSTs, return elements of both BSTs in sorted form.


// Example 1:

// Input:
// BST1:
//        5
//      /   \
//     3     6
//    / \
//   2   4  
// BST2:
//         2
//       /   \
//      1     3
//             \
//              7
//             /
//            6
// Output: 1 2 2 3 3 4 5 6 6 7
// Explanation: 
// After merging and sorting the
// two BST we get 1 2 2 3 3 4 5 6 6 7.
// Example 2:

// Input:
// BST1:
//        12
//      /   
//     9
//    / \    
//   6   11
// BST2:
//       8
//     /  \
//    5    10
//   /
//  2
// Output: 2 5 6 8 9 10 11 12
// Explanation: 
// After merging and sorting the
// two BST we get 2 5 6 8 9 10 11 12.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function merge() which takes roots of both the BSTs as its input and returns an array of integers denoting the node values of both the BSTs in a sorted order.


// Expected Time Complexity: O(M+N) where M and N are the sizes if the two BSTs.
// Expected Auxiliary Space: O(Height of BST1 + Height of BST2).


// Constraints:
// 1 ≤ Number of Nodes ≤ 105
class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
     public List<Integer> merge(Node root1,Node root2)
   {
       Queue<Integer> queue1 = new LinkedList<>();
       Queue<Integer> queue2 = new LinkedList<>();
      
       Inorder(root1,queue1);
       Inorder(root2,queue2);
       List<Integer> result = new ArrayList<Integer>();
       
       while(!queue1.isEmpty() || !queue2.isEmpty())
       {
           if(queue1.peek() < queue2.peek() )
           {
               result.add(queue1.poll());
           }
           else
           {
               result.add(queue2.poll());
           }
           if(queue1.isEmpty())
           {
                while(!queue2.isEmpty()) 
                {
                result.add(queue2.poll());
                }
           }
           
           if(queue2.isEmpty()) 
           {
               while(!queue1.isEmpty()) {
                   
                 result.add(queue1.poll());
                   
               }
               
           }
       }
       return result;
   }
   
   public void Inorder(Node root, Queue<Integer> queue)
   {
       if(root==null) return;
       Inorder(root.left,queue);
       queue.offer(root.data);
       Inorder(root.right,queue);
   }

}

