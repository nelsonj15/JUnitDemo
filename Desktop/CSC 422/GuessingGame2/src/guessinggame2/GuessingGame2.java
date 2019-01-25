/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame2;

import java.util.Random;
import java.util.Scanner;



public class GuessingGame2 {

    

    
    public static void main(String[] args) {
        
        int answer, guess;
        final int MAX = 10;
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        answer = rand.nextInt(MAX) + 1;
        
        System.out.print("Guess a number between 1 and 10: ");
                guess = keyboard.nextInt();
                
                
                if(guess == answer){
                        System.out.println("Good Job, the number is " + answer);
                }
                else{
                    System.out.println("Sorry, the number was " + answer);
                }
    }
    
}
