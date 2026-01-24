package com.java.fundamentals;

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println("Table for Given Number :" +n);

        for(int i=1;i<=10;i++)
        {

           int p=n*i;

            System.out.println(n +"x" +i+"="+p);

        }

    }
}
