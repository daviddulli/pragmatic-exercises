package org.fasttrackit;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/*
Simple interest is something you use only when making a
quick guess. Most investments use a compound interest
formula, which will be much more accurate. And this formula requires you to incorporate exponents into your programs.
Write a program to compute the value of an investment
compounded over time. The program should ask for the
starting amount, the number of years to invest, the interest
rate, and the number of periods per year to compound.
The formula you’ll use for this is
A = P(1 +r/n)^(nt)
where
• P is the principal amount.
• r is the annual rate of interest.
• t is the number of years the amount is invested.
• n is the number of times the interest is compounded per
year.
• A is the amount at the end of the investment.
 */

public class Exercise13 {
    public static void main(String[] args) {
        double principal, rate, years, compoundedNr, worth;
        System.out.println("Enter the principal.");
        Scanner scanner = new Scanner(System.in);
        principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest.");
        scanner = new Scanner(System.in);
        rate = scanner.nextDouble();
        System.out.println("Enter the number of years.");
        scanner = new Scanner(System.in);
        years = scanner.nextDouble();
        System.out.println("Enter the number of times the interest is compounded per year.");
        scanner = new Scanner(System.in);
        compoundedNr = scanner.nextDouble();
        worth = principal * Math.pow((1 + rate/ compoundedNr / 100), (compoundedNr * years));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(principal) + " invested at " +
                rate + "% for " + years + " years compounded " + compoundedNr + " times per year is " +
                NumberFormat.getCurrencyInstance(Locale.US).format(worth));

    }
}
