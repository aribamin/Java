/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wages;

// Importing input scanner
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class Wages {

    /**
     * This program calculates gross pay, taxes, and net pay
     */
    public static void main(String[] args) {
        // Defining variables and constants
        double totalHoursWorked;
        double hourlyRate;
        double grossPay;
        double netPay;
        final double taxRate = .28;
        double taxes;
        double overtimeHoursWorked = 0;
        double regularHoursWorked;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Asking user for amount of hours worked
        System.out.print("Please enter the number of hours worked: ");
        // Getting amount of hours worked
        totalHoursWorked = input.nextDouble();
        // Asking user for hourly rate
        System.out.print("Please enter your hourly rate: ");
        // Getting hourly rate
        hourlyRate = input.nextDouble();
        // Closing input stream
        input.close();
        
        // If total hours worked is greater than 40
        if (totalHoursWorked > 40)
        {
            // Calculating overtime hours worked
            overtimeHoursWorked = totalHoursWorked % 40;
        }
        // Calculating for regular hours worked
        regularHoursWorked = totalHoursWorked - overtimeHoursWorked;
        // Calculating for gross pay
        grossPay = regularHoursWorked * hourlyRate + overtimeHoursWorked * hourlyRate * 1.5;
        // Calculating for taxes
        taxes = grossPay * taxRate;
        // Calculating net pay
        netPay = grossPay - taxes;
        
        // Setting up money(currency) format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Outputting grossPay in money format
        System.out.println("\nYour gross pay is " + money.format(grossPay));
        // Outputting taxes in money format
        System.out.println("Taxes are " + money.format(taxes));
        // Outputting netPay in money format
        System.out.println("Net pay is " + money.format(netPay));
        
    }
    
}
