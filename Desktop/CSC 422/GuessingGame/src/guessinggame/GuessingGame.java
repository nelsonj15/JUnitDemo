/*
 * CSC 422 Spring 2019 - Prj Week 2 GuessingGameUnlimitiedAttemptsHighLow
 * Created by: Rob Nelson
 * Creation Date: 01/27/19
 * Revision Date: 01/27/19
 */
package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        // Create a random number generator

        Random random = new Random();

        // Use Scanner for getting input from user

        Scanner scanner = new Scanner(System.in);

        // Use the random generator to 
        // pick a number between 0 and 99 (inclusive)

        int number = random.nextInt(10);
        int guess = -1;
        int count = 0;

        // Loop until the user has guessed the number

        while (guess != number) {

            // Prompt the user for their next guess

            System.out.print("Guess a number between 0-100: P.S. I will tell you if you are too low, or too high. Good Luck  \n  ");

            // Read the users guess

            guess = scanner.nextInt();
            count++;

            // Check if the guess is high, low or correct

            if (guess < number) {

                // Guess is too low

                System.out.println("Too low, please try again");

            } else if (guess > number) {

                // Guess is too high

                System.out.println("Too high, please try again");

            } else {

                // Guess is correct !!

               System.out.println("Correct, the number was " + number + ". You needed " + count + " times");
            }
        }
    }

}

