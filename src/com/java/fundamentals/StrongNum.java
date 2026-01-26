package com.java.fundamentals;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;

        while(number > 0) {
            int s = number%10;
            int factorial =1;
             for(int j=1;j<=s;j++){
                 factorial = factorial*j;
             }
            sum = sum + factorial;
            number = number/10;

            }
        if (sum == temp) {
            System.out.println("The number is a strong number.");
        }else {
            System.out.println("The number is not a strong number.");
        }


    }
}
