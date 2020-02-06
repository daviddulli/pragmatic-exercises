package org.fasttrackit;

import java.util.Scanner;
/*Create a program that prompts for an input string and displays output that shows the input string and the number of
characters the string contains

 */

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line + " has " + line.length() + " characters.");
    }
}
