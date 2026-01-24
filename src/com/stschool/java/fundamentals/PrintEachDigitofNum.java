package com.stschool.java.fundamentals;

import java.util.Scanner;

public class PrintEachDigitofNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.println("Digits of a given number");

        int p = (int)Math.log10(n);

        while(n > 0) {
            int q = n / (int)Math.pow(10,p);
            System.out.println(q);
            n = n % (int)Math.pow(10,p);
            p--;

        }

    }


}
