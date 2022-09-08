/*
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.

Input Format
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

Constraints
1<=t<=100 1<=n,m<=100000

Output Format
Print the maximum path.

Sample Input
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output
122
Explanation
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = new int[m];
			int[] arr2 = new int[n];
			for(int i=0;i<m;i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				arr2[i] = sc.nextInt();
			}
			System.out.println(MaximumPathSum(arr,arr2));
		}
    }
	public static int MaximumPathSum(int[] arr,int[] arr2)
	{
		int m = arr.length;
		int n = arr2.length;
		int i=0,j=0;
		int sum1=0;
		int sum2=0;
		int res = 0;

		while(i<m && j<n)
		{
			if(arr[i]<arr2[j])
			{
				sum1 = sum1 + arr[i];
				i++;
			}
			else if(arr[i]>arr2[j])
			{
				sum2 += arr2[j];
				j++;
			}
			else{
				// arr[i] == arr2[j];
				res = res + Math.max(sum1,sum2);
				sum1=0;
				sum2=0;
				while(i<m && j<n && arr[i] == arr2[j])
				{
					res += arr[i];
					i++;
					j++;
				}
			}
		}
		while(i<m)
		{
			sum1 += arr[i];
			i++;
		}
		while(j<n)
		{
			sum2 += arr2[j];
			j++;
		}
		res += Math.max(sum1,sum2);
		return res;
	}
}
