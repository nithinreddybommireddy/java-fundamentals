package com.java.fundamentals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int reverse = 0;
        int temp = n;
        while (n > 0) {
            int temp1 = n % 10;
            reverse = reverse * 10 + temp1;
            n = n / 10;
        }
        if (reverse == temp) {
            System.out.println("Given number is Palindrome ");
        } else {
            System.out.println("Given number is not Palindrome ");
        }
        sc.close();
    }
}
