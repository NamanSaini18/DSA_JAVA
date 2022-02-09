// permutation example
// Example: the input string is "abc"
// print all the permutations of the given string
//
// abc
// acb
// bac
// bca
// cab
// cba
public class Permutation {
  
    public static void answer(String str, String ans){
        // Base condition
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
      // Here we are iterating the given String again and again and checking different subStrings of the given String according to its length again and again
        for (int i = 0; i < str.length(); i++) {
            String Remaining_String = str.substring(0,i)+ str.substring(i+1);
            char extract = str.charAt(i);
            answer(Remaining_String,ans+extract);    //Recursive call
            
        }
    }

    public static void main(String[] args) {
        answer("abc"," ");  // This is the Driver Code in which we are providing the String directly, We can also take this String input from the User by performing some
      // little modifications in the code.
    }
}
