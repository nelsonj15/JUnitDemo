/*
 * CSC 422 Spring 2019 - Prj Week 1 GuessingGame
 * Created by: Rob Nelson
 * Creation Date: 01/22/19
 * Revision Date: 01//19
 */


package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        int answer;
        int guess;
        final int MAX = 20;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;
        
        System.out.print("Hello and welcome to Rob Nelson's Guessing Game!  \n" );

        System.out.print("Guess a number between 1 and 20:  \n");
        guess = keyboard.nextInt();


        if (guess == answer) {
            System.out.println("Awesome, you guessed the number 1st try! The number was: " + answer);
        } else {
            System.out.println("Sorry you got it wrong. Better luck next time. The number was: " + answer);
        }
    }

}