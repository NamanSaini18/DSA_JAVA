/*
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
1 <= nums[i] <= 1000
0 <= k <= 106
*/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pdt = 1;
        int si=0,ei=0;
        int Wsize = 1;
        int ans = 0;
        while(ei < nums.length)
        {
            // window growing
            pdt *= nums[ei];
            //Window Shrink Kro
            while(pdt >= k && si<=ei)
            {
                pdt = pdt/nums[si];
                si++;
            }
            
    
            ans = ans + ei - si + 1;
            ei++;
        }
        return ans;
        
    }
   
}
