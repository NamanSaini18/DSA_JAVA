/*
Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
*/
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        int LeftHeight = GetHeight(root.left);
        int RightHeight = GetHeight(root.right);
        if(Math.abs(LeftHeight-RightHeight)>1)
        {
            return false;
        }
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public int GetHeight(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return Math.max(GetHeight(root.left),GetHeight(root.right))+1;
        }
    }
}
