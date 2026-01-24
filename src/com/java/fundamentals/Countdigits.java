package com.java.fundamentals;

import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println("Digits on given number");
          int count=1;
        for(int i=1;i<n;i++)
        {
          int s=n%10;
          count++;
         n=n/10;
        }
        System.out.println(count);


    }


}
