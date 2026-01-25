package com.java.fundamentals;

import java.util.Scanner;

public class PrimeNumber {
    public static int isPrime(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("is a prime");
        } else {
            System.out.println("is not a prime");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int x = isPrime(n);
        System.out.println(x);

    }

}
