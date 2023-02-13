/*
1523. Count Odd Numbers in an Interval Range
Easy
2K
129
Companies
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

 

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:

Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
 

Constraints:

0 <= low <= high <= 10^9
*/
class Solution {
    public int countOdds(int low, int high) 
    {
        /*
        ==> TLE Using Below Approach (Because of Unnecessary Time Consumption)

        int ctr = 0;
        for(long i = low;i<=high;i++)
        {
            if(i%2 != 0)
            {
                ctr++;
            }
        }
        return ctr;
        */
        int count = high - low + 1;  // Total Numbers in Given Range(low and High are inclusive)
        if(count % 2 == 0)
        {
            return count/2; // If total numbers in given range are even then half are odd & half are even
        }
        else
        {
            if(low % 2 != 0)   // If low is starting from a odd number
            {
                return count/2 + 1;
            }
            else
            {
                return count/2;
            }
        }
        
    }
}
