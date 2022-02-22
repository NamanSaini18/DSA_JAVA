import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            ans += st.pop();
        }
        System.out.println(ans);
        
    }
}
