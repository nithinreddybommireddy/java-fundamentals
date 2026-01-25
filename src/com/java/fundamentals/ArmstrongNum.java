package com.java.fundamentals;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int temp = n;

        int p = (int) Math.log10(n) + 1;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, p);
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("Given number is Armstrong ");
        } else {
            System.out.println("Given number is not Armstrong ");
        }
        sc.close();
    }

}
