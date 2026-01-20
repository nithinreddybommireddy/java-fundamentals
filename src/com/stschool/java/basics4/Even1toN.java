package com.stschool.java.basics4;

import java.util.Scanner;

public class Even1toN {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println("Even number upto :" +n);

        for(int i=1;i<=n;i++)
        {

            if(i%2==0)
            {
                System.out.println(i);
            }
            }

    }
}
