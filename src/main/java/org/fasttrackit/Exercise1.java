package org.fasttrackit;

import java.util.Scanner;

/*The “Hello, World” program is the first program you learn
to write in many languages, but it doesn’t involve any input.
So create a program that prompts for your name and prints
a greeting using your name.
 */

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");

    }

}
