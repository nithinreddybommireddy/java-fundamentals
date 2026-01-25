package com.java.fundamentals;

import java.util.Scanner;

public class productofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            product *= rem;
            n = n / 10;
        }
        System.out.println("The product of the digits is " + product);

        sc.close();

    }


}
