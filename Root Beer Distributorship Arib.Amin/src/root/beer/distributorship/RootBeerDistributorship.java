/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.beer.distributorship;

// Importing input scanner
import java.util.Scanner;
/**
 *
 * @author arib.amin
 */
public class RootBeerDistributorship {

    /**
     * This program tracks inventory of different root beer products
     */
    public static void main(String[] args) {
        // Setting up constants and variables
        final int aandwID = 1;
        final int hiresID = 2;
        final int barqsID = 3;
        final int dadsID = 4;
        final int flag = 0;
        int aandwInventory;
        int hiresInventory;
        int barqsInventory;
        int dadsInventory;
        int idNumber;
        int aandwTransaction;
        int hiresTransaction;
        int barqsTransaction;
        int dadsTransaction;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in); 
        // Title for start of the week
        System.out.println("Start of the week");
        // Asking user for initial amount of A&W
        System.out.print(aandwID + "(A&W)\t\tinventory: ");
        // Getting initial amount of A&W
        aandwInventory = input.nextInt();
        // Asking user for initial amount of Hires
        System.out.print(hiresID + "(Hires)\tinventory: ");
        // Getting initial amount of Hires
        hiresInventory = input.nextInt();
        // Asking user for initial amount of Barq's
        System.out.print(barqsID + "(Barq's)\tinventory: ");
        // Getting initial amount of Barq's
        barqsInventory = input.nextInt();
        // Asking user for initial amont of Dad's
        System.out.print(dadsID + "(Dad's)\tinventory: ");
        // Getting initial amount of Dad's
        dadsInventory = input.nextInt();
        
        // Do statements
        do {
            // Asking user for ID number
            System.out.print("\nEnter ID number (enter " + flag + " to end): ");
            // Getting ID number
            idNumber = input.nextInt();
            // If ID number is same as A&W ID
            if (idNumber == aandwID){
                // Asking user for amount of A&W purchased/sold
                System.out.print("How much A&W purchased(+#) or sold(-#)? ");
                // Getting amount of A&W purchased/sold
                aandwTransaction = input.nextInt();
                // Calculating A&W inventory
                aandwInventory = aandwInventory + aandwTransaction;
            // If ID number is same as Hires ID
            }else if (idNumber == hiresID){
                // Asking user for amount of Hires purchased/sold
                System.out.print("How much Hires purchased(+#) or sold(-#)? ");
                // Getting amount of Hires purchased/sold
                hiresTransaction = input.nextInt();     
                // Calculating Hires inventory
                hiresInventory = hiresInventory + hiresTransaction;
            // If ID number is same as Barq's ID
            }else if (idNumber == barqsID){
                // Asking user for amount of Barq's purchased/sold
                System.out.print("How much Barq's purchased(+#) or sold(-#)? ");
                // Getting amount of Barq's purchased/sold
                barqsTransaction = input.nextInt();
                // Calculating Barq's inventory
                barqsInventory = barqsInventory + barqsTransaction;
            // If ID number is same as Dad's ID
            }else if (idNumber == dadsID){
                // Asking user for amount of Dad's purchased/sold
                System.out.print("How much Dad's purchased(+#) or sold(-#)? ");
                // Getting amount of Dad's purchased/sold
                dadsTransaction = input.nextInt();
                // Calculating Dad's inventory
                dadsInventory = dadsInventory + dadsTransaction; 
            }
        // Loop while id number does not equal 0
        } while (idNumber != flag);
        // When loop ends output ended
        System.out.println("Ended.");
        // Closing input stream
        input.close();
        
        // Title for final inventory
        System.out.println("\nFinal inventory");
        // Outputting new A&W inventory
        System.out.println(aandwID + "(A&W)\t\tinvetory: " + aandwInventory);
        // Outputting new Hires inventory
        System.out.println(hiresID + "(Hires)\tinvetory: " + hiresInventory);
        // Outputting new Barq's inventory
        System.out.println(barqsID + "(Barq's)\tinvetory: " + barqsInventory);
        // Outputting new Dad's inventory
        System.out.println(dadsID + "(Dad's)\tinvetory: " + dadsInventory);
    }
}
