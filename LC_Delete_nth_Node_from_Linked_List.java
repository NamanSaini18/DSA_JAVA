// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode deletenode = new ListNode();
        deletenode.next = head;
        ListNode temp1 = deletenode;
        ListNode temp2 = deletenode;
        while(n>0)
        {
            temp1 = temp1.next;
            n--;
        }
       
            while(temp1.next != null)
            {
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            temp2.next = temp2.next.next;
        
        return deletenode.next;
    }
}
