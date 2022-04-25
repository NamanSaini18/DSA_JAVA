// Given two sorted arrays of size m and n, your task is to merge both the arrays and find the median.

// Input Format

// First line contains m. Second line contains m space separated integer values. Third line contains n. Fourth line contains n space separated integer values.

// Constraints

// 1<=m,n<=200

// Output Format

// print the median after merger.

// Sample Input 0

// 5
// 1 3 5 7 9
// 4
// 2 4 6 8
// Sample Output 0

// 5
// Explanation 0

// After merger the array will be 1 2 3 4 5 6 7 8 9. The median of this array is 5.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for(int i=0; i<m; i++)
        { 
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        int[] res = new int[m+n];
        for(int i=0; i<m+n; i++){
            if(i<m) 
            {
                res[i] = arr1[i];
            }
            else 
            {
                res[i] = arr2[i-m];
            }
        }
        Arrays.sort(res);
        if(res.length % 2 == 0)
        {
            System.out.println((res[res.length/2] + res[res.length/2 -1])/2);
        }
        else 
        {
            System.out.println(res[res.length/2]);
        }
    }
}
