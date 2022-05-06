/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch.order.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class LunchOrderAribAmin {

    /**
     * This program shows nutrition values and returns order total
     */
    public static void main(String[] args) {
        // Defining variables
        int amount;
        double total = 0;
        
        // Outputting nutrition labels
        System.out.format("%-15s %7s %10s %12s %10s", "Item", "Price", "Fat(g)", "Carbohydrates(g)", "Fiber(g)\n");
        // Outputting hamburger nutrients
        System.out.format("%-12s %10s %7s %10s %15s", "hamburger", "$1.85", "9", "33", "1\n");
        // Outputting salad nutrients
        System.out.format("%-12s %10s %7s %10s %15s", "salad", "$2.00", "1", "11", "5\n");
        // Outputting french fries nutrients
        System.out.format("%-5s %10s %7s %10s %15s", "french fries", "$1.30", "11", "36", "4\n");
        // Outputting soda nutrients
        System.out.format("%-15s %7s %7s %10s %15s", "soda", "$0.95", "0", "38", "0\n");
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Setting up hamburger item
        Food hamburger = new Food(1.85, 9, 33, 1);
        // Setting up salad item
        Food salad = new Food(2.00, 1, 11, 5);
        // Setting up french fries item
        Food frenchfries = new Food(1.30, 11, 36, 4);
        // Setting up soda item
        Food soda = new Food(0.95, 0 , 38, 0);
        
        // Asking user for amount of hamburgers
        System.out.print("\nEnter number of hamburgers: ");
        // Getting amount of hamburgers
        amount = input.nextInt();
        // Outputting nutrition label
        System.out.println("Each hamburger has " + hamburger.nutrition());
        // Adding price of hamburgers to total
        total += hamburger.addItemTotal(amount);
        
        // Asking user for amount of salads
        System.out.print("\nEnter number of salads: ");
        // Getting amount of salads
        amount = input.nextInt();
        // Outputting nutrition label
        System.out.println("Each salad has " + salad.nutrition());
        // Adding price of salads to total
        total += salad.addItemTotal(amount);

        // Asking user for amount of fries
        System.out.print("\nEnter number of fries: ");
        // Getting amount of fries
        amount = input.nextInt();
        // Outputting nutrition label
        System.out.println("French fries have " + frenchfries.nutrition());
        // Adding price of french fries to total
        total += frenchfries.addItemTotal(amount);
        
        // Asking user for amount of fries
        System.out.print("\nEnter number of sodas: ");
        // Getting amount of fries
        amount = input.nextInt();
        // Outputting nutrition label
        System.out.println("Each soda has " + soda.nutrition());
        // Adding price of sodas total
        total += soda.addItemTotal(amount);
        
        // Setting up money format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Outputting order total
        System.out.println("\nYour order comes to: " + money.format(total));
        
        // Closing imput stream
        input.close();
    }   
}
