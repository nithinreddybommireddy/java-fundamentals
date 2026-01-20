package com.stschool.java.basics4;

import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
