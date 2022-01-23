// This is the code for removing consecutive duplicates from a given String using recursion

// Q. In a string S, remove consecutive duplicates from it recursively.

// Sample Input 1 :
// aabccba
// Sample Output 1 :
// abcba
import java.util.Scanner;

public class RemoveOcc {
    public static String remove(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        if(str.charAt(0)==str.charAt(1))
            return remove(str.substring(1));
        else
            return str.charAt(0) + remove(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in which you want to remove duplicates: ");
        String str = sc.nextLine();
        System.out.println("Given String after removing duplicates is: ");
        System.out.println(remove(str));
    }
}
