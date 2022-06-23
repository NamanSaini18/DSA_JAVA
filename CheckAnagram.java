import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        if(str.length() == str2.length())
        {
            char arr1[] = str.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean res = Arrays.equals(arr1,arr2);
            if(res)
            {
                System.out.println("Strings are anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }
    }
}
