/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spending.arib.amin;

// Import input stream
import java.util.Scanner;
// Import number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class SpendingAribAmin {

    /**
     * This program calculates budget percentages
     */
    public static void main(String[] args) {
        
        // Defining variables
        double food;
        double clothing;
        double entertainment;
        double rent;
        double foodBudget;
        double clothingBudget;
        double entertainmentBudget;
        double rentBudget;
        double totalBudget;
        
        // Open input stream
        Scanner input = new Scanner (System.in);
        // Asks user to enter money spent last month
        System.out.println("Enter the amount spent last month on the following items: ");
        // Aks user to enter food money
        System.out.print("\nFood: $");
        // Gets food money from user
        food = input.nextDouble();
        // Asks user to enter clothing money
        System.out.print("Clothing: $");
        // Gets clothing money from user
        clothing = input.nextDouble();
        // Asks user to enter entertainment money
        System.out.print("Entertainment: $");
        // Gets entertainment money from user
        entertainment = input.nextDouble();
        // Asks user to enter rent money
        System.out.print("Rent: $");
        // Gets rent money from user
        rent = input.nextDouble();
        // Close input stream
        input.close();
    
        // Formats output to percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        // Set minimum fractions digits to two
        percent.setMinimumFractionDigits(2);
        
        // Outputs category and budget headings
        System.out.println("\nCategory\tBudget");
        // Calculates total budget
        totalBudget = food + clothing + entertainment + rent;
        // Calculates food budget percentage
        foodBudget = food / totalBudget;
        // Outputs food buget percentage
        System.out.println("Food\t\t" + percent.format(foodBudget));
        // Calculates clothing budget percentage
        clothingBudget = clothing / totalBudget;
        // Outputs clothing budget percentage
        System.out.println("Clothing\t" + percent.format(clothingBudget));
        // Calculates entertainment budget percentage
        entertainmentBudget = entertainment / totalBudget;
        // Outputs entertainment budget percentage
        System.out.println("Entertainment\t" + percent.format(entertainmentBudget));
        // Calculates rent budget percetange
        rentBudget = rent / totalBudget;
        //Outputs rent buget percentage percentage
        System.out.print("Rent\t\t" + percent.format(rentBudget));
    }
    
}
