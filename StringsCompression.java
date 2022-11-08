/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.
*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ctr = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1) == str.charAt(i))
			{
				ctr++;
			}
			else
			{
				sb.append(str.charAt(i-1));
				if(ctr != 1)
				{
					sb.append(ctr);
				}
				ctr=1;
			}
		}
		sb.append(str.charAt(str.length()-1));
		if(ctr != 1)
		{
			sb.append(ctr);
		}
		System.out.println(sb.toString());
    }
}
