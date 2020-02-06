package org.fasttrackit;

import java.util.Scanner;
/*When working in a global environment, you’ll have to
present information in both metric and Imperial units. And
you’ll need to know when to do the conversion to ensure
the most accurate results.
Create a program that calculates the area of a room. Prompt
the user for the length and width of the room in feet. Then
display the area in both square feet and square meters.
 */


public class Exercise7 {
    public static void main(String[] args) {
        final double conversionFactor = 0.09290304;
        double width, length, squareFeet, squareMeter;
        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        System.out.println("What is the width of the room in feet?");
        scanner = new Scanner(System.in);
        width = scanner.nextDouble();

        squareFeet = width * length;
        squareMeter = squareFeet * conversionFactor;
        System.out.println("The area is " + squareFeet +  " square feet and " + squareMeter +  " square meters.");

    }
}
