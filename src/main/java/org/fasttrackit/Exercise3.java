package org.fasttrackit;

import java.util.Scanner;

/*Quotation marks are often used to denote the start and end
of a string. But sometimes we need to print out the quotation
marks themselves by using escape characters.
Create a program that prompts for a quote and an author.
Display the quotation and author as shown in the example
output.
 */

public class Exercise3 {
    public static void main(String[] args) {
        String quote, author;
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        quote = scanner.nextLine();
        System.out.println("Who said this?");
        scanner = new Scanner(System.in);
        author = scanner.nextLine();
        System.out.println(author + " said, \"" + quote + ".\"" );

    }

}
