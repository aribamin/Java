/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metric.conversion.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Importing nubmer format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class MetricConversionAribAmin {

    /**
     * Converts inches to centimeters
     * pre: gets inches
     * post: converts and returns centimeters
     */
    public static double inchesToCentimeters(double inches){
        // declaring variables
        double centimeters;
        
        // converting to centimeters
        centimeters = inches * 2.54;
        // returns centimeters
        return(centimeters);
    }
    
    /**
     * Converts centimeters to inches
     * pre: gets centimeters
     * post: converts and returns inches
     */
    public static double centimetersToInches(double centimeters){
        // declaring variables
        double inches;
        
        // converting to inches
        inches = centimeters / 2.54;
        // returning inches
        return(inches);
    }
    
    /**
     * Converts feet to centimeters
     * pre: gets feet
     * post: converts and returns centimeters
     */
    public static double feetToCentimeters (double feet) {
        // declaring variables
        double centimeters;
        
        // converting to centimeters
        centimeters = feet * 30;
        // returning centimeters
        return(centimeters);
    }
    
    /**
     * Converts centimeters to feet
     * pre: gets centimeters
     * post: converts and returns feet
     */
    public static double centimetersToFeet (double centimeters) {
        // declaring variables
        double feet;
        
        // converting to feet
        feet = centimeters / 30;
        // returning feet
        return(feet);
    }
    
    /**
     * Converts yards to meters
     * pre: gets yards
     * post: converts and returns meters
     */
    public static double yardsToMeters (double yards) {
        // declaring variables
        double meters;
        
        // converting to meters
        meters = yards * 0.91;
        // returning meters
        return(meters);
    }
    
    /**
     * Converts meters to yards
     * pre: gets meters
     * post: converts and returns yards
     */
    public static double metersToYards (double meters) {
        // declaring variables
        double yards;
        
        // converting to yards
        yards = meters / 0.91;
        // returning yards
        return(yards);
    }
    
    /**
     * Converts miles to kilometers
     * pre: gets miles
     * post: converts and returns kilometers
     */
    public static double milesToKilometers (double miles) {
        // declaring variables
        double kilometers;
        
        // converting to kilometers
        kilometers = miles * 1.6;
        // returning kilometers
        return kilometers;
    }
    
    /**
     * Converts kilometers to miles
     * pre: gets kilometers
     * post: converts and returns miles
     */
    public static double kilometersToMiles (double kilometers) {
        // declaring variables
        double miles;
        
        // converting to miles
        miles = kilometers / 1.6;
        // returning miles
        return miles;
    }
    
    /**
     * 
     * This program converts user input to different output unit
     */
    public static void main(String[] args) {
        // Declaring variables
        double userInput;
        double convertedOutput;
        int userChoice;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Asking user to input a number
        System.out.print("Enter a number: ");
        // Getting user input
        userInput = input.nextDouble();
        
        // Title for conversions
        System.out.println("\nConvert: ");
        // Outputting options for inches to centimeters and centimeters to inches
        System.out.println("1. Inches to Centimeters \t 5. Centimeters to Inches");
        // Outputting options for feet to centimeters and centimeters to feet
        System.out.println("2. Feet to Centimeters \t\t 6. Centimeters to Feet");
        // Outputting options for yards to meters and meters to yards
        System.out.println("3. Yards to Meters \t\t 7. Meters to Yards");
        // Outputting options for miles to kilometers and kilometers to yards
        System.out.println("4. Miles to Kilometers \t\t 8. Kilometers to Miles\n");
        
        // Asking user for option choice
        System.out.print("Enter your choice: ");
        // Getting option choice
        userChoice = input.nextInt();
        // Closing input stream
        input.close();
        
        // Setting up numberformat
        NumberFormat number = NumberFormat.getNumberInstance();
        // Setting up switch
        switch (userChoice) {
                    // Converting from inches to centimeters
            case 1: convertedOutput = inchesToCentimeters(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " inches equals " + number.format(convertedOutput) + " centimeters."); break;
                    // Converting from feet to centimeters
            case 2: convertedOutput = feetToCentimeters(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " feet equals " + number.format(convertedOutput) + " centimeters."); break;
                    // Converting from yards to meters
            case 3: convertedOutput = yardsToMeters(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " yards equals " + number.format(convertedOutput) + " meters."); break;
                    // Converting from miles to kilometers
            case 4: convertedOutput = milesToKilometers(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " miles equals " + number.format(convertedOutput) + " kilometers."); break;
                    // Converting from centimeters to inches
            case 5: convertedOutput = centimetersToInches(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " centimeters equals " + number.format(convertedOutput) + " inches."); break;
                    // Converting from centimeters to feet
            case 6: convertedOutput = centimetersToFeet(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " centimeters equals " + number.format(convertedOutput) + " feet."); break;
                    // Converting from meters to yards
            case 7: convertedOutput = metersToYards(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " meters equals " + number.format(convertedOutput) + " yards."); break;
                    // Converting from kilometers to miles
            case 8: convertedOutput = kilometersToMiles(userInput);
                    // Outputting user input and converted output
                    System.out.println("\n" + number.format(userInput) + " kilometers equals " + number.format(convertedOutput) + " miles."); break;
        }
    }
}
