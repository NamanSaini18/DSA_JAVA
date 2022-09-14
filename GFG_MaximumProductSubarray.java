/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
Note: Use 64-bit integer data type to avoid overflow.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 500
-102 ≤ Arri ≤ 102
*/

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if (n == 1) 
        {
			return arr[0];
		}

		long Lpdt = arr[0];
		long Rpdt = arr[n - 1];
		long max = Math.max(Lpdt, Rpdt);
		for (int i = 1; i < n; ++i) {
			Lpdt = Lpdt == 0 ? arr[i] : Lpdt * arr[i];
			Rpdt = Rpdt == 0 ? arr[n - i - 1] : Rpdt * arr[n - i - 1];
			max = Math.max(max, Math.max(Lpdt, Rpdt));
		}

		return max;
    }
}
