/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleep.arib.amin;

// Importing input stream
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class SleepAribAmin {

    /**
     * This program calculates days alive and hours slept
     */
    public static void main(String[] args) {
       
        // Declaring variables
        int birthYear;
        int birthMonth; 
        int birthDay;
        int todayYear;
        int todayMonth;
        int todayDay;
        int daysAlive;
        int hoursSlept;
        
        // Open input stream
        Scanner input = new Scanner (System.in);
        // Asks user for birthdate
        System.out.println("Enter your birthdate: ");
        // Asks user for birth year
        System.out.print("Year: ");
        // Getss birth year from user
        birthYear = input.nextInt();
        // Asks user for birth month
        System.out.print("Month: ");
        // Gets birth month from user
        birthMonth = input.nextInt();
        // Asks user for birth day
        System.out.print("Day: ");
        // Gets birth day from user
        birthDay = input.nextInt();
        
        // Ask user for today's date
        System.out.println("Enter today's date: ");
        // Asks user for today year
        System.out.print("Year: ");
        // Gets today year from user
        todayYear = input.nextInt();
        // Asks user for today month
        System.out.print("Month: ");
        // Gets today month from user
        todayMonth = input.nextInt();
        // Asks user for today day
        System.out.print("Day: ");
        // Gets today day from user
        todayDay = input.nextInt();
        // Close inputstream
        input.close();
        
        // Formatting output to number
        NumberFormat number = NumberFormat.getIntegerInstance();
        // Calculating days alive (Amount of days from 0000 to today's date) - (Amount of days from 0000 to birthdate)
        daysAlive = (((todayYear - 1) * 365) + ((todayMonth - 1) * 30) + todayDay) - (((birthYear - 1) * 365) + ((birthMonth - 1) * 30) + birthDay);
        // Outputs amount of days alive
        System.out.println("You have been alive for " + number.format(daysAlive) + " days.");
        
        // Calculating amount of hours slept (Amount of days alive)*(8 hours a day)
        hoursSlept = daysAlive * 8;
        // Outputs amount of hours slept
        System.out.print("You have slept " + number.format(hoursSlept) + " hours.");
    }
    
}
