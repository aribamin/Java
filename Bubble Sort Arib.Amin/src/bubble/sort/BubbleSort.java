/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

// Importing input scanner
import java.util.Scanner;
/**
 *
 * @author arib.amin
 */
public class BubbleSort {

    /**
     * This program sorts numbers from least to greatest
     */
    public static void main(String[] args) {
        // Defining array and variables
        int[] numArray = new int[10];
        int integer;
        int temp;
        
        // Setting up input stream
        Scanner input = new Scanner(System.in);

        // Looping for length of array
        for (int num = 0; num < numArray.length; num++){
            // Asking user for numbers
            System.out.print("Enter integer #: ");
            // Getting numbers from user
            integer = input.nextInt();
            // Setting nubmers into array elements 0 to 9
            numArray[num] = integer;
        }
        
        // Lopping for 0 to 8 inclusive
        for (int pass1 = 0; pass1 <= 8; pass1++){
            // Looping for 0 to 8 inclusive
            for (int pass = 0; pass <= 8; pass++){
                // If array element is greater than array element plus 1
                if (numArray[pass] > numArray[pass+1]){
                    // Temp equals array element
                    temp = numArray[pass];
                    // Array element equals array element plus 1
                    numArray[pass] = numArray[pass+1];
                    // Array element plus 1 equals temp (array element)
                    numArray[pass+1] = temp;
                }
                
            }
        }
        
        // Looping for length of array
        for (int i = 0; i < numArray.length; i++){
            // Outputting elements in array
            System.out.print(numArray[i] + " ");
        }
        
        // Closing input stream
        input.close();
    }
}
