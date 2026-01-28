package com.java.fundamentals;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Welcome to E-Commerce Shopping!");

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Product");
        System.out.println("2. Exit Shopping");
        short userChoice = sc.nextShort();
        int availableStock = 100;
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        double totalAmount, discountedPrice, totalSavedAmount, discountAmount, stateTax, centralTax, finalProductPrice;
        short shippingCharges;
        float discountPercentage;

        char continueShopping ;
        do {
            if (availableStock == 0) {
                System.out.println("Stock is unavailable ");
                break;
            }
            switch (userChoice) {
                case 1:

                    System.out.println("WELCOME TO THE PRODUCT SECTION: ");

                    System.out.print("Enter product Price:");
                    int productPrice = sc.nextInt();

                    System.out.print("Enter Discount Membership Type : ");
                    char membershipType = sc.next().toLowerCase().charAt(0);
                    switch (membershipType) {

                        case 's':
                            discountPercentage = 10;
                            shippingCharges = 50;
                            break;

                        case 'g':
                            discountPercentage = 15;
                            shippingCharges = 20;
                            break;
                        case 'd':
                            discountPercentage = 20;
                            shippingCharges = 0;
                            break;
                        default:
                            discountPercentage = 0;
                            shippingCharges = 100;
                    }

                    discountAmount = productPrice * (discountPercentage / 100);
                    discountedPrice = productPrice - discountAmount;

                    stateTax = discountedPrice * (STATE_TAX_PERCENTAGE / 100);
                    centralTax = discountedPrice * (CENTRAL_TAX_PERCENTAGE / 100);

                    finalProductPrice = discountedPrice + stateTax + centralTax;

                    System.out.println("Product price : " + productPrice);
                    System.out.println("Discount Percentage : " + discountPercentage + "%");
                    System.out.println("Discount Amount : " + discountAmount);
                    System.out.println("Discounted Price : " + discountedPrice);
                    System.out.println("State Tax : " + stateTax);
                    System.out.println("Central Tax : " + centralTax);
                    System.out.println("Product price : " + finalProductPrice);
                    System.out.println("Shipping Charges : " + shippingCharges);

                    System.out.print("Enter Product Quantity : ");
                    int productQuantity = sc.nextInt();
                    availableStock = availableStock - productQuantity;
                    System.out.println("Available Stock : " + availableStock);


                    totalSavedAmount = (productQuantity * discountAmount);
                    totalAmount = finalProductPrice * productQuantity + shippingCharges;

                    System.out.println("Total Saved Amount : " + totalSavedAmount);
                    System.out.println("Total Amount : " + totalAmount);
                    System.out.println("ThankYou for shopping!");


                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");


            }

            System.out.println("Are you want to Continue Shopping (Y/N)?");
            continueShopping = sc.next().toUpperCase().charAt(0);


        } while (continueShopping == 'Y');



        sc.close();
    }
    }