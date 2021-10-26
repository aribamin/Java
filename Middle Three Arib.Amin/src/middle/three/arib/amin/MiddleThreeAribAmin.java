/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middle.three.arib.amin;

import java.util.Scanner;
/**
 *
 * @author arib.amin
 */
public class MiddleThreeAribAmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String phrase; 
        String threeLetters;  
        int phraseLength;  
        int mid;  
        
        Scanner input = new Scanner(System.in);    
        /* get string from user */  
        System.out.print("Enter text that contains at least three characters: ");  
        phrase = input.nextLine();  
        input.close();
        
        /* determine middle of phrase */  
        phraseLength = phrase.length();  
        mid = phraseLength / 2;
  
        /* display middle three characters */  
        threeLetters = phrase.substring(mid - 1, mid + 2);  
        System.out.println("Middle three characters are: " + threeLetters); 
    }   
}
