package org.fasttrackit;
import java.util.Scanner;
/*Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then
construct a list of words and place them into the story, creating an often silly or funny story as a result.
Create a simple mad-lib program that prompts for a noun,
a verb, an adverb, and an adjective and injects those into a
story that you create
 */

public class Exercise4 {
    public static void main(String[] args) {
        String noun, verb, adjective, adverb;
        System.out.println("Enter your noun: ");
        Scanner scanner = new Scanner(System.in);
        noun =  scanner.nextLine();

        System.out.println("Enter your verb: ");
        scanner = new Scanner(System.in);
        verb = scanner.nextLine();

        System.out.println("Enter your adjective: ");
        scanner = new Scanner(System.in);
        adjective = scanner.nextLine();

        System.out.println("Enter your adverb: ");
        scanner = new Scanner(System.in);
        adverb = scanner.nextLine();

        System.out.println("Today I went to the Zoo. I saw a(n) " + adjective + " " + noun +
                " jumping up and down in it's tree." + " He " + verb + "es " + adverb +
                " trough the large tunel everyday.");



    }
}
