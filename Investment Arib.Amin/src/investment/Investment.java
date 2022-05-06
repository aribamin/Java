/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investment;

// Importing input scanner
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class Investment {

    /**
     * This program calculates how many years it will take for investment to reach goal
     */
    public static void main(String[] args) {
        // Defining variables
        double investmentOriginal;
        double investmentGoal;
        double compound;
        int years = 0;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Asking user for investment original
        System.out.print("Enter investment original: $");
        // Getting investment original
        investmentOriginal = input.nextDouble();
        // Asking user for investment goal
        System.out.print("Enter investment goal: $");
        // Getting investment goal
        investmentGoal = input.nextDouble();
        // Askiing user for compound in percent
        System.out.print("Compound(in percent): ");
        // Getting compound in percent
        compound = input.nextDouble();
        // If compound is greater than one
        if (compound > 1){
            // Transforming compound to decimal
            compound = compound / 100;    
        }
        // Closing input stream
        input.close();
        
        // While original is less than goal
        while (investmentOriginal < investmentGoal) {
            // Adding annual compound to investment
            investmentOriginal = investmentOriginal + (investmentOriginal * compound);
            // Counting amount of years required
            years = years + 1;
        }
        // Setting up currency format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Outputting amount of years required
        System.out.println("It will take " + years + " years to reach " + money.format(investmentGoal));
    }
}
