// Write a program to find x to the power n (i.e. x^n). Take x and n from the user.


import java.util.Scanner;

public class FindingExponent {
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if (n%2==0)
            return power(x, n / 2) * power(x, n / 2);
        else
            return x * power(x, n / 2) * power(x, n / 2);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number: ");
        int x = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int n = sc.nextInt();
        System.out.println(power(x,n));

    }
}
// Author - Naman Saini
