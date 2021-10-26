/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling.arib.amin;

// Importing input scanner
import java.util.Scanner;
// Importing number format
import java.text.NumberFormat;
/**
 *
 * @author arib.amin
 */
public class BowlingAribAmin {

    /**
     * This program calculates percentage of elite bowlers and percentage of average bowlers
     */
    public static void main(String[] args) {
        // Defining variables
        int score;
        int totalScores = 0;
        int eliteScores = 0;
        double elitePercent;
        int averageScores = 0;
        double averagePercent;
        final int sentinel = -1;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);
        // Do statements
        do {
            // Asking user for bowling scores
            System.out.print("Please enter the bowling score (-1 to quit):");
            // Getting bowling score
            score = input.nextInt();
            
            // If score is >= 200 and score is <= 300
            if (score >= 200 && score <= 300) {
                // Adding to elite scores
                eliteScores += 1;
            // If score is >= 0 and score is < 200
            }else if (score >= 0 && score < 200){
                // Adding to average scores
                averageScores += 1;
            }
            
            // If score is within valid range
            if (score >=0 && score <= 300) {
                // Adding to total scores
                totalScores += 1;
            }
        // Loop while score does not equal flag (-1)
        } while (score != sentinel);
        
        // Calculating for percentage of elite scores
        elitePercent = ((double)eliteScores/totalScores);
        // Calculating for percentage of average scores
        averagePercent = ((double)averageScores/totalScores);
        // Setting up percent number format
        NumberFormat percent = NumberFormat.getPercentInstance();
        // Setting mimimum digits
        percent.setMinimumFractionDigits(1);
        // Outputting percentage of elite bowlers
        System.out.println("\nElite Bowlers " + percent.format(elitePercent));
        // Outputting percentage of average bowlers
        System.out.println("Average Bowlers " + percent.format(averagePercent));
    }
}
