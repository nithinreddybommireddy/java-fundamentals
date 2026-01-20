package com.stschool.java.basics4;

import java.util.Scanner;

public class SumofFirstNaturalnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println("Sum of first N natural number upto :" +n);
         int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
