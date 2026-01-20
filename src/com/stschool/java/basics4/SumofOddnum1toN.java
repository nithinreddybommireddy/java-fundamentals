package com.stschool.java.basics4;

import java.util.Scanner;

public class SumofOddnum1toN {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println(" Sum of Odd number upto :" +n);
        int oddsum=0;
        for(int i=1;i<=n;i++)
        {
            if (i % 2 == 1)
            {
                oddsum = oddsum + i;
            }

        }
        System.out.println(oddsum);

    }

}
