package com.java.fundamentals;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        System.out.println("Sum of digits of a Number :" + sum);
        sc.close();

    }
}
