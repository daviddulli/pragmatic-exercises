package org.fasttrackit;

import java.util.Scanner;

/*
Sometimes you have to round up to the next number rather
than follow standard rounding rules.
Calculate gallons of paint needed to paint the ceiling of a
room. Prompt for the length and width, and assume one
gallon covers 350 square feet. Display the number of gallons
needed to paint the ceiling as a whole number.

 */

public class Exercise9 {
    public static void main(String[] args) {
        final int gallonCapacity = 350;
        int width, length, squareFeet;
        System.out.println("What is the length of the ceiling in feet?");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("What is the width of the ceiling in feet?");
        scanner = new Scanner(System.in);
        width = scanner.nextInt();
        squareFeet = width * length;

        int gallonsNeeded = 0;
        do {
            squareFeet = squareFeet - gallonCapacity;
            gallonsNeeded++;
        }while (squareFeet > 0);
        System.out.println("You will need to purchase " + gallonsNeeded + " of paint to cover " + width * length +
                " square feet");

    }

}
