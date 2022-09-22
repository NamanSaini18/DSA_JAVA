package com.Recursion;

import java.util.Scanner;

public class NCoinsTossed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String coin = "HT";
        System.out.println("The outcomes when"+" "+n+" "+"coins are tossed simultaneously is: ");
        PrintOutcomes(n," ");

    }
    public static void PrintOutcomes(int n,String ans)
    {

        if(n==0)
        {
            System.out.println(ans+" ");
            return;
        }
        PrintOutcomes(n-1,ans+'H');
        PrintOutcomes(n-1,ans+'T');
    }
}
