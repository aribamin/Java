/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Importing randomizer
import java.util.Random;
/**
 *
 * @author arib.amin
 */
public class HiLoAribAmin {

    /*
    * This method takes guess and doubles or deducts points risked
    * Pre: getting guess, points, and risk 
    * Post: evaluating guess and calculating new points total
    */
    public static int hiLo(int guess, int points, int risk) {
        // Declaring variable
        int random;
        
        // Setting up randomizer
        Random r = new Random();
        // Generating random number from 1 to 13
        random = (r.nextInt(13)+1);
        // Outputting random number
        System.out.println("Number is " + random);
        
        // If guess is high and btween 8 and 13
        if (guess == 1 && random >= 8 && random <= 13){
            // Outputting win
            System.out.println("You win.");
            // Doubling points risked
            points = points + risk;
        // If guess is low and between 1 and 6
        }else if (guess == 0 && random >= 1 && random <= 6){
            // Outputting win
            System.out.println("You win.");
            // Doubling points risked
            points = points + risk;
        // If guess is incorrect
        }else {
            // Outputting lose
            System.out.println("You lose.");
            // Deducting points risked
            points = points - risk;
        }
        
        // Returning new points total
        return points;
    }
    
    /**
     * This program evaluates if user guess is correct/incorrect and doubles/deducts user points risked
     */
    public static void main(String[] args) {
        // Declaring variables
        int points;
        int risk;
        int guess;
        int again;
        int guesses = 0;
        
        // Outputting game title
        System.out.println("High Low Game");
        // Outputting rules
        System.out.println("\nRULES");
        // Outputting 1 to 6 are low
        System.out.println("Numbers 1 through 6 are low");
        // Outputting 8 to 13 are high
        System.out.println("Numbers 8 through 13 are high");
        // Outputting 7 is neither high or low
        System.out.println("Number 7 is neither high or low");
        
        // Setting initial points
        points = 1000;
        // Outputting points total
        System.out.println("\nYou have " + points + " points.");
        
        //Setting up input stream
        Scanner input = new Scanner(System.in);
       
        // Do statements
        do {
            // Asking user for amount risked
            System.out.print("\nEnter points to risk: ");
            // Getting amount risked
            risk = input.nextInt();
            // Asking user for high or low guess
            System.out.print("\nPredict <1=High, 0=Low>: ");
            // Getting high or low guess
            guess = input.nextInt();
            // Calling hiLo method to evaluate high or low guess and new points total
            points = hiLo(guess, points, risk);
            // Asking user for play again
            System.out.print("Play again(Any # to continue, 0 to end)? ");
            // Getting play again
            again = input.nextInt(); 
            // Outputting new points total
            System.out.println("\nYou have " + points + " points.");
            // Counter for amount of guesses
            guesses = guesses + 1;
        // Do statements while points > 0 and play again does not equal 0
        }while (points > 0 && again != 0);
        // Closing input stream.
        input.close();
      
        // If final points equals 0
        if (points == 0) {
            // Outputting amount of tries to run out
            System.out.println("It took " + guesses + " guess(es) to run out of points.");
        // If final points does not equal 0
        }else {
            // Outputting amount of tries to get to final points
            System.out.println("It took " + guesses + " gusses(es) to get " + points + " points.");
        }
        
    } 
}
