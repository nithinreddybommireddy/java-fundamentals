package com.java.fundamentals;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int smallest = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp > smallest) {
                smallest = temp;
            }
        }
        System.out.println("The smallest digit is " + smallest);

        sc.close();

    }
}
