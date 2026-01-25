package com.java.fundamentals;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        sc.close();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount );
        System.out.println(oddCount);

    }
}
