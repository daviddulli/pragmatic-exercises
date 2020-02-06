package org.fasttrackit;

import java.util.Scanner;
/*
Working with multiple inputs and currency can introduce
some tricky precision issues.
Create a simple self-checkout system. Prompt for the prices
and quantities of three items. Calculate the subtotal of the
items. Then calculate the tax using a tax rate of 5.5%. Print
out the line items with the quantity and total, and then print
out the subtotal, tax amount, and total
 */

public class Exercise10 {
    public static void main(String[] args) {
        final double tax = 5.5;
        double price1, price2, price3, quantity1, quantity2, quantity3;
        double subtotal, taxes = 0, totalPrice;
        System.out.println("Enter the first items price.");
        Scanner scanner = new Scanner(System.in);
        price1 = scanner.nextDouble();
        System.out.println("Enter the first item quantity.");
        scanner = new Scanner(System.in);
        quantity1 = scanner.nextInt();

        System.out.println("Enter the second items price.");
        price2 = scanner.nextDouble();
        System.out.println("Enter the second item quantity.");
        scanner = new Scanner(System.in);
        quantity2 = scanner.nextInt();

        System.out.println("Enter the third items price.");
        price3 = scanner.nextDouble();
        System.out.println("Enter the third item quantity.");
        scanner = new Scanner(System.in);
        quantity3 = scanner.nextInt();

        subtotal = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;
        taxes = (subtotal * tax) / 100;
        totalPrice = subtotal + taxes;

        System.out.println("Subtotal: $" + subtotal + "\n" + "Taxes: $" + taxes + "\n" + "Total: $" + totalPrice);


    }

}
