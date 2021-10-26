/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgpackage.check.arib.amin;

// Importing imput scanner
import java.util.Scanner;
/**
 *
 * @author arib.amin
 */
public class PackageCheckAribAmin {

    /**
     * This program checks if package dimensions are okay
     */
    public static void main(String[] args) {
        
        // Defining variables and constants
        double packageWeight;
        double packageLength;
        double packageWidth;
        double packageHeight;
        double packageSize;
        final double packageMaxWeight = 27;
        final double packageMaxSize = 100000;
        
        // Setting up input scanner
        Scanner input = new Scanner(System.in);
        // Asks user for package weight
        System.out.print("Enter the package weight in kilograms: ");
        // Gets package weight
        packageWeight = input.nextDouble();
        // Asks user for package length
        System.out.print("Enter the package length in centimeters: ");
        // Gets package length
        packageLength = input.nextDouble();
        // Asks user for package width
        System.out.print("Enter package width in centimeters: ");
        // Gets package width
        packageWidth = input.nextDouble();
        // Asks user for package length
        System.out.print("Enter package height in centimeters: ");
        // Gets length from user
        packageHeight = input.nextDouble();
        // Closing input scanner
        input.close();
        
        // Calculating package size
        packageSize = packageLength * packageWidth * packageHeight;
        
        // If both wieght and size are above then
        if (packageWeight > packageMaxWeight & packageSize > packageMaxSize)
        {
            // Output package is too heavy and large
            System.out.println("Too heavy and too large.");
        // If size is above then
        }else if (packageSize > packageMaxSize){
            // Output package is too large
            System.out.println("Too large.");
        // If weight is above then
        }else if (packageWeight > packageMaxWeight){
            // Output package is too heavy
            System.out.println("Too heavy.");
        // If package dimensions are good
        }else {
            // Output package dimension are good
            System.out.println("Package dimensions are good.");
        }
    }
}
