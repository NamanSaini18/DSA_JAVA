import java.util.Scanner;

public class DSALEC24 {
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of which you want you to check the fibonacci no: ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci series of given no is: ");
        System.out.println(fib(n));

    }
}
