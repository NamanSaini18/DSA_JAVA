import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int cooks = sc.nextInt();
		int[] arr = new int[cooks];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(calculate(p,cooks,arr));

    }
	public static int time(int rank,int p)
	{
		return (p*(p+1)/2)*rank;
	}
	public static boolean MinTime(int p,int cooks,int[] arr,int m)
	{
		int min,j=0,tm=0,i=1;
		while(p>0)
		{
			if(time(arr[j],i)<=m)
			{
				i++;
				p--;
			}
			else
			{
				j++;
				if(j==cooks)
				{
					return false;
				}
				i=1;
				tm=0;

			}
		}
		return true;
	}
	public static int calculate(int p,int cooks,int[] arr)
	{
		int s = time(arr[0],1);
		int e = time(arr[cooks-1],p),m=0,ans=0;
		while(s <= e)
		{
			// System.out.println(s+" "+e);
			m = (s + e)/2;
			if(MinTime(p,cooks,arr,m))
			{
				ans = m;
				e=m-1;
			}
			else{
				s=m+1;
			}

		}
		return ans;
	}
}
