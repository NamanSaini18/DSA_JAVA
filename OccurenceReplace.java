// Q. Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character c2 in the given string.
// Do this recursively.
// Sample Input :
// abaca
// a x
// Sample Output :
// xbxcd
import java.util.Scanner;

public class StrOccurence {
    public static String replace(String str, char c1, char c2)
    {
        int a = str.length();
        char[] arr = str.toCharArray();
        for(int i=0;i<a;i++)
        {
            if(arr[i]==c1)
                arr[i]=c2;
            else if(arr[i]==c2)
                arr[i]=c1;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Naman Saini");
        System.out.println("Enter the required String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character which you want to replace: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter the character by which you want to replace the required character: ");
        char c2 = sc.next().charAt(0);
        System.out.println(replace(str, c1, c2));

    }
}
