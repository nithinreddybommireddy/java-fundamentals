package com.stschool.java.fundamentals;

import java.util.Scanner;

public class Odd1toN
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number:");
    int n=sc.nextInt();
    System.out.println("Odd number upto :" +n);

    for(int i=1;i<=n;i++)
    {

        if((i % 2) == 1)
        {
            System.out.println(i);
        }
    }

}
}
