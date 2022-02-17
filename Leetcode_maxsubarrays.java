// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104

class Solution {
    public int maxSubArray(int[] nums) {
        
        int size=nums.length;
        int i=0,sum=0;
        int max=nums[0];
        int[] arr = new int[size];
        
        while(i != size)
        {
            arr[i]=nums[i];
            i++;
        }
   
        Arrays.sort(arr);
        if(arr[size-1]<=0)
            return arr[size-1];
    
        i=0;
        while(i!=size)
        {
            sum += nums[i];
            if(sum<0)
            {
                sum=0;
            }
            else if(sum>max)
                max=sum;
            System.out.println(max);
            i++;
        }
        System.out.println(max);
        return max;
    }
}
