/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnival;

/**
 *
 * @author michael.brouet
 */
public class Player {
    private double spendingMoney;
    private String prizesWon;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Player object created. Spending money given to player.
	 * Prize won set to to none.
	 */
	public Player(double money) {
            spendingMoney = money;
            prizesWon = "";
	}
	

	/** 
	 * Player pays for and then plays a game.
	 * pre: none
	 * post: Player's spending money decreased by cost of game.
	 * The player has a new prize added to existing prizes.
	 */
	public String play(GameBooth game) {
            String newPrize;
		
            if (game.getCost() > spendingMoney) {
                return("Sorry, not enough money to play.");
            } else {
                spendingMoney -= game.getCost();			//pay for game
		newPrize = game.start();					//play the game and get prize
		prizesWon = newPrize + ", " + prizesWon;	//add new prize to existing prizes
		return("prize won: "  + newPrize);			//display the new prize won
            }
	}


	/** 
	 * Returns the list of prizes won.
	 * pre: none
	 * post: The list of prizes is returned.
	 */
	public String showPrizes() {
            return(prizesWon);
	}
}
