package org.fasttrackit;

import java.util.Calendar;
import java.util.Scanner;

/*Your computer knows what the current yearis, which means
you can incorporate that into your programs. You just have
to figure out how your programming language can provide
you with that information.
Create a program that determines how many years you have
left until retirement and the year you can retire. It should
prompt for your current age and the age you want to retire
and display the output as shown in the example that follow
 */

public class Exercise6 {
    public static void main(String[] args) {
        int currentAge, retirementAge, currentYear, retirementYear, yearsUntilRetirement;
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        currentAge = scanner.nextInt();
        System.out.println("At what age do you want to retire?");
        scanner = new Scanner(System.in);
        retirementAge = scanner.nextInt();
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        yearsUntilRetirement = (retirementAge - currentAge);
        retirementYear = currentYear + yearsUntilRetirement;
        System.out.println("You have " + yearsUntilRetirement + "years left until you can retire." + "\n" +
                "It's " + currentYear + ", so you can retire in "  + retirementYear);


    }

}
