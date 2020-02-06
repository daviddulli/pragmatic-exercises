package org.fasttrackit;

import java.util.Scanner;
/*
Division isn’t always exact, and sometimes you’ll write
programs that will need to deal with the leftovers as a whole
number instead of a decimal.
Write a program to evenly divide pizzas. Prompt for the
number of people, the number of pizzas, and the number of
slices per pizza. Ensure that the number of pieces comes out
even. Display the number of pieces of pizza each person
should get. If there are leftovers, show the number of leftover
pieces.
 */

public class Exercise8 {
    public static void main(String[] args) {
        int people, pizzas, slices, leftovers;
        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        people = scanner.nextInt();
        System.out.println("How many pizzas?");
        scanner = new Scanner(System.in);
        pizzas = scanner.nextInt();
        //o pizza medie este taiata in 8. exercitiul nu ne spune in cate bucati sa taiem pizza respectiva, ci cate
        //felii primeste fiecare de asta si formula de mai jos.
        slices = (pizzas * 8) / people;
        leftovers = (pizzas * 8) % people;
        System.out.println("Each pizza is cut in 8 pieces.");
        System.out.println(people + " people with " + pizzas + " pizzas... \n" +
                "Each person gets " + slices + " slices of pizza. \nThere are " + leftovers + " leftovers.");
    }
}
