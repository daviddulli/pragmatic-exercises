package org.fasttrackit;

import java.util.Scanner;
/*You’ll often write programs that deal with numbers. And
depending on the programming language you use, you’ll
have to convert the inputs you get to numerical data types.
Write a program that prompts for two numbers. Print the
sum, difference, product, and quotient of those numbers as
shown in the example output:
 */

public class Exercise5 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the first number...");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Enter the second number...");
        scanner = new Scanner(System.in);
        b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b) + "\n" + a + " - " + b + " = " + (a - b) + "\n" +
                a + " * " + b + " = " + (a * b) + "\n" + a + " / " + b + " = " + (a / b));

    }

}
