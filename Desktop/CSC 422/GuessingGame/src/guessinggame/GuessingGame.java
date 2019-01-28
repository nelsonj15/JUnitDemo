/*
 * CSC 422 Spring 2019 - Prj Week 2 GuessingGame
 * Created by: Rob Nelson
 * Creation Date: 01/27/19
 * Revision Date: 01/27/19
 */


package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        final int MAX = 100;
        int answer;
        int guess;
        String another = "y";
        boolean flag = false;
        boolean anotherFlag = true;
        
        while(anotherFlag){
            answer = generator.nextInt(MAX) + 1;
            
            System.out.println("I'm thinkin of a number between 1 and " + MAX );
            System.out.println("Can you guess what it is? \n");
            flag = false;
            while(!flag) {
                guess = scan.nextInt();
                
                if(guess == answer){
                    System.out.println("You guessed correctly");
                    flag = true;
                            
                } else{
                    System.out.println("That was wrong, try again.");
                }
            }
        
            System.out.println("Want to Play again?(y/n)");
            another = scan.next();
            
            if(another.equalsIgnoreCase("y") == true){
                anotherFlag = true;
            } else{
                anotherFlag = false;
            }
    }
    
}
}
