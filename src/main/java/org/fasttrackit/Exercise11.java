package org.fasttrackit;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
At some point, you might have to deal with currency
exchange rates, and you’ll need to ensure your calculations
are as precise as possible.
Write a program that converts currency. Specifically, convert
euros to U.S. dollars. Prompt for the amount of money in
euros you have, and prompt for the current exchange rate
of the euro. Print out the new amount in U.S. dollars. The
formula for currency conversion is
amount to = (amount from × rate from) / rate to
where
• Amount to is the amount in U.S. dollars.
• Amount from is the amount in euros.
• rate from is the current exchange rate in euros.
• rate to is the current exchange rate of the U.S. dollar.
 */


public class Exercise11 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        double euros, exchangeRate, dollars;
        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        euros = scanner.nextDouble();
        System.out.println("What is the exchange rate?");
        scanner = new Scanner(System.in);
        exchangeRate = scanner.nextDouble();
        dollars = (euros * exchangeRate) / 100;
        System.out.println(euros + " euros at the exchange rate of of " + exchangeRate + " is " + df2.format(dollars) +
                " U.S. dollars.");

    }
}
