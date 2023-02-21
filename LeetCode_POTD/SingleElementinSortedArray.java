/*
540. Single Element in a Sorted Array
Medium
8.1K
125
Companies
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
*/
class Solution {
    public int singleNonDuplicate(int[] arr) {
        // Using Binary Search
       int start = 0;
        int end = arr.length-1;
        if(start == end)
        {
            return arr[0];
        }
        while(start < end)
        {
            int mid = (start + end)/2;
            int temp = mid;
            if(arr[mid] == arr[mid-1])
            {
                temp = mid;

            }
            else if(arr[mid] == arr[mid+1])
            {
                temp = mid+1;
            }
            else
            {
                return arr[mid];
            }
            if(temp % 2 != 0)
            {
                start = temp +1;
            }
            else
            {
                end = temp-2;
            }
        }
        return arr[end];

        
    }
}
