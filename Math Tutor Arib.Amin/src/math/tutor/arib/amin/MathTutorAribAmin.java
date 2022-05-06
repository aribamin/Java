/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.tutor.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Inporting randomizer
import java.util.Random;
/**
 *
 * @author arib.amin
 */
public class MathTutorAribAmin {

    /**
     * This program adds, subtracts, multiplies or dives two random numbers
     */
    public static void main(String[] args) {
        
        // Defining variables
        int randomNumber1;
        int randomNumber2;
        int operator;
        int answer = 0;
        int guess;
        
        // Setting up randomizer
        Random r = new Random();
        // Generate random number 1
        randomNumber1 = (r.nextInt(10)+1);
        // Generate random number 2
        randomNumber2 = (r.nextInt(10)+1);
        // Generate random operator
        operator = (r.nextInt(4)+1);
        
        // Setting up switch
        switch (operator){
                // Outputting addition question
        case 1: System.out.print("What is " + randomNumber1 + " + " + randomNumber2 + "? "); 
                // Answer equals randomNumber1 plus randomNumber2
                answer = randomNumber1 + randomNumber2; break;
                // Outputting subtraction question
        case 2: System.out.print("What is " + randomNumber1 + " - " + randomNumber2 + "? ");
                // Answer equal randomNumber1 subtract randomNumber2
                answer = randomNumber1 - randomNumber2; break;
                // Outputting multiplication quention
        case 3: System.out.print("What is " + randomNumber1 + " * " + randomNumber2 + "? ");
                // Answer equals randomNumber1 times randomNumber2
                answer = randomNumber1 * randomNumber2; break;
                // Setting answer equal to randomNumber1
        case 4: answer = randomNumber1;
                // Setting randomNumber1 equal to randomNumber1 times randomNumber2
                randomNumber1 = randomNumber1 * randomNumber2;
                // Outputting division question
                System.out.print("What is " + randomNumber1 + " / " + randomNumber2 + "? "); break;
        }
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Gets answer from user
        guess = input.nextInt();
        // Closing input stream
        input.close();
        
        // If user guess equals answer
        if (guess == answer)
        {
            // Then output correct
            System.out.println("Correct!");
        // If user guess does not equal answer
        }else
        {
            // Then output incorrect, then correct answer
            System.out.println("Incorrect! Correct answer = " + answer);
        }
    }
}
