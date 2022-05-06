/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunch.order.arib.amin;

/**
 * Food Class
 * @author arib.amin
 */
public class Food {
    // Defining variables
    private double price;
    private double fat;
    private double carbs;
    private double fiber;
    
    /*
    * Writing constructor for price, fat, carbs, and fiber
    */
    public Food(double nprice, double nfat, double ncarbs, double nfiber) {
        // Getting price, fat, carbs, and fiber for item
        price = nprice;
        fat = nfat;
        carbs = ncarbs;
        fiber = nfiber; 
    }
  
    /*
    * This method sets up and returns nutrition label
    * Pre: getting fat, carbs, and fiber
    * Post: returns nutrition label with fat, carbs, and fiber
    */
    public String nutrition(){
        //Defining variable
        String nutrients;
        // Setting up nutrition label
        nutrients = fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber.";
        // Returning nutrition label
        return (nutrients);
    }
    
    /*
    * This method calculates total of each item and adds to total
    * Pre: getting item price and amount of item
    * Post: returning price for amount of item
    */
    public double addItemTotal(int amount){
        // Defining variable
        double itemTotal;
        // Initializing item total
        itemTotal = 0;
        // Calculating item total
        itemTotal += (amount*price);
        // Returning item total
        return (itemTotal);
    }   
}
