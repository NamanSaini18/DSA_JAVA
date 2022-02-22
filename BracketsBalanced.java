// Hackerrank contest problem named Brackets Balanced using Stack
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = isBalanced(str);
        if (b)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");

        }
    }
    public static boolean isBalanced(String str) {
        if ((str.length()%2) == 1)
        {
            return false;
        }
        else {
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray())
                switch (ch) {
                    case '{':
                    {
                        stack.push('}');
                        break;
                    }
                    case '(':
                    {
                        stack.push(')');
                        break;
                    }
                    case '[':
                    {
                        stack.push(']');
                        break;
                    }
                    default :
                        if (stack.isEmpty() || ch != stack.peek())
                        {
                            return false;
                        }
                        stack.pop();
                }
            return stack.isEmpty();

        }
    }
}
