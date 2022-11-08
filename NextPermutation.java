import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			// System.out.println(nextPermutation(arr));
			nextPermutation(arr);
			
		}
    }
	public static void nextPermutation(int[] nums) {
     int p = 0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                p=i;
                break;
            }
        }
        int q=0;
        for(int i =nums.length-1;i>p;i--)
        {
            if(nums[i]>nums[p])
            {
                q=i;
                break;
            }
        }
        
        if(p==0 && q==0)
        {
            Range_reverse(nums,0,nums.length-1);
            return;
        }
        
        int temp = nums[p];
        
		nums[p] = nums[q];
		nums[q] = temp;
		Range_reverse(nums, p + 1, nums.length - 1);
		System.out.println();
		
    }
    public static void Range_reverse(int[] arr,int i, int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
