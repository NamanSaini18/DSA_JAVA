/**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106 **/
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        
        int len = a.length + b.length;
        
        int idx1 = 0;  
        int idx2 = 0;  
        
        int prev = 0;           
        int curr = 0;          
        int res = 0;       
        
        while(res++ <= (len / 2)) 
		{     
            
            prev = curr;         

            if(idx1 >= a.length) {     
                curr = b[idx2++];   
                continue;                
            } 
            
            if(idx2 >= b.length ) {    
                curr = a[idx1++];
                continue;
            } 
            
            if(a[idx1] < b[idx2])
                curr = a[idx1++];
            else 
                curr = b[idx2++];
            
        }
        
        if(len % 2 == 0) 
            return (double) (prev  + curr)/2;   
        else 
            return (double) curr;                   
        
    }
}
