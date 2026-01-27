package com.java.fundamentals;

import java.util.Scanner;

public class LCMofTwoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int max;
        if(a > b)
             max=a;
        else
             max= b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
        sc.close();
    }
}



