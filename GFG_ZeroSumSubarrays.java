/*
You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


Example 1:

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

Example 2:

Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

Your Task:
You don't need to read input or print anything. Complete the function findSubarray() that takes the array arr and its size n as input parameters and returns the total number of sub-arrays with 0 sum. 
 

Expected Time Complexity: O(n*log(n))
Expected Auxilliary Space: O(n)
 

Constraints:    
1 <= n <= 10^6
-10^9 <= arr[ i ] <= 10^9
*/
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long preSum = 0, ans = 0;
        Map<Long, Integer> freq = new HashMap<>();
        for (long num : arr) {
            preSum += num;
            if(preSum == 0)
                ans++;
            freq.put(preSum, freq.getOrDefault(preSum, 0) + 1);
        }
        for (int v : freq.values()) {
            ans += ((v * (v-1)) / 2);
        }
        return ans;
    }
}
