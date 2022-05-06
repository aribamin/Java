/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class EggsAribAmin {

    /**
     * Calculating price of eggs purchased
     *
     */
    public static void main(String[] args) {
        
        // Defining constants and variables
        final double zeroToFour = 0.50;
        final double fourToSix = 0.45;
        final double sixToEleven = 0.40;
        final double elevenOrMore = 0.35;
        int totalEggsPurchased;
        int dozensPurchased;
        int remainderEggsPurchased;
        double price;
                
        // Setting up input scanner
        Scanner input = new Scanner(System.in);
        // Asks user for total eggs purchased
        System.out.print("Enter the number of eggs purchased: ");
        // Gets total eggs purchased
        totalEggsPurchased = input.nextInt();
        
        // Calculating dozens purchased
        dozensPurchased = totalEggsPurchased / 12;
        // Calculating remainder eggs
        remainderEggsPurchased = totalEggsPurchased % 12;
        
        // If dozens >= 0 and < 4 then
        if (dozensPurchased >= 0 & dozensPurchased < 4)
        {
            // Price equals dozens purchased * $0.50 + remainder eggs * 0.50 / 12
            price = (dozensPurchased * zeroToFour) + (remainderEggsPurchased * zeroToFour / 12);
        // If dozens >= 4 and < 6 then
        }else if (dozensPurchased >= 4 & dozensPurchased < 6)
        {
            // Price equals dozens purchased * $0.45 + remainder eggs * 0.45 / 12
            price = (dozensPurchased * fourToSix) + (remainderEggsPurchased * fourToSix /12);
        // If dozens >= 6 and < 11 then    
        }else if (dozensPurchased >= 6 & dozensPurchased < 11)
        {
            // Price equals dozens purchased * $0.40 + remainder eggs * 0.40 / 12
            price = (dozensPurchased * sixToEleven) + (remainderEggsPurchased * sixToEleven /12);
        // If dozens >= 11 then
        }else
        {
            // Price equals dozens purchased * $0.35 + remainder eggs * 0.35 / 12
            price = (dozensPurchased * elevenOrMore) + (remainderEggsPurchased * elevenOrMore /12);
        }
        
        // Setting up money format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Formatting and outputting price of eggs purchased
        System.out.println("The bill is equal to: " + money.format(price));
    }
}
