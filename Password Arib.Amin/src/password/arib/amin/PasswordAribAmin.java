/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.arib.amin;

// Importing input scanner
import java.util.Scanner;
/**
 *
 *
 */
public class PasswordAribAmin {

    /**
     * This program checks if password is correct or incorrect
     */
    public static void main(String[] args) {
        // Defining variables
        final String password = "Gastonk";
        String guess; 
        int tries = 0;
        
        // Setting up input scanner
        Scanner input = new Scanner(System.in);
        // Do these actions
        do {
        // Asks user for guess
        System.out.print("Enter the password: ");
        // Gets guess from user
        guess = input.nextLine();
        
        // If guess equals password
        if (password.compareTo(guess) == 0){
            // Outputs "The password you typed is correct."
            System.out.println("The password you typed is correct.");
        // If guess does not equal password
        } else{
            // Outputs "The password you typed is incorrect."
            System.out.println("The password you typed is incorrect.");
        }
  
        // Adds one to amount of tries
        tries = tries + 1;
        // Loop while tries is less than three and guess does not equal answer
        } while (tries < 3 & password.compareTo(guess) != 0);
        
        if (password.compareTo(guess) == 0){
            System.out.println("Welcome.");
        }else {
            System.out.println("Access denied.");
        }
    }
}
