package org.fasttrackit;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Computing simple interest is a great way to quickly figure
out whether an investment has value. It’s also a good way
to get comfortable with explicitly coding the order of operations in your programs.
Create a program that computes simple interest. Prompt for
the principal amount, the rate as a percentage, and the time,
and display the amount accrued (principal + interest).
The formula for simple interest is
A = P(1 + rt), where P is
the principal amount, r is the annual rate of interest, t is the
number of years the amount is invested, and A is the amount
at the end of the investment.
 */

public class Exercise12 {
    public static void main(String[] args) {
        double principal, rate, years, worth;
        System.out.println("Enter the principal.");
        Scanner scanner = new Scanner(System.in);
        principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest.");
        scanner = new Scanner(System.in);
        rate = scanner.nextDouble();
        System.out.println("Enter the number of years.");
        scanner = new Scanner(System.in);
        years = scanner.nextDouble();
        worth = principal * ( 1 +  (rate / 100) * years);
        System.out.println("After " + years + "years at " + rate + "%, the investment will be worth " +
                NumberFormat.getCurrencyInstance(Locale.US).format(worth));
    }


}
