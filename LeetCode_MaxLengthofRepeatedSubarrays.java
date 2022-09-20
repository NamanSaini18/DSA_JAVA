/*
Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.

 

Example 1:

Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
Output: 3
Explanation: The repeated subarray with maximum length is [3,2,1].
Example 2:

Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
Output: 5
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 100

*/
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int max = 0;
        
        for(int i=1-n;i<m;i++)
        {
            int ctr = 0;
            for(int j=0;j<n;j++)
            {
                if(i+j<0)
                {
                    continue;
                }
                else if(i+j>=m)
                {
                    break;
                }
                else if(nums1[i+j] == nums2[j])
                {
                    ctr++;
                    max = Math.max(max,ctr);
                }
                else
                {
                    ctr= 0;
                }
                
            }
        }
        return max;
    }
}
