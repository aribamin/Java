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
public class GameBooth {
    private double cost;
    private String firstPrize, consolationPrize;

	
/**
	 * constructor
	 * pre: none
	 * post: A GameBooth object created. 
	 * The cost and prizes are set.
	 */
    public GameBooth(double charge, String p1, String p2) {
	cost = charge;
	firstPrize = p1;
	consolationPrize = p2;
	}
	

	/** 
	 * Game is played and prize awarded.
	 * pre: none
	 * post: Player had three tries. Player successful all 
	 * three times received the first prize. A consolation 
	 * prize has been awarded otherwise.
	 */
	public String start() {
            int toss;
            int successes = 0;
	 	
	 	/* play game */
            for (int i = 0; i < 3; i++) {	//player gets three tries
	 	toss = (int)(Math.random() + 0.5);	//0 or 1
	 	if (toss == 1) {
                    successes += 1;			//1 is a successful toss
	 	}
	 	}
	 	
	 	/* award prize */
	 	if (successes == 3) {
	 		return(firstPrize);
	 	} else {
	 		return(consolationPrize);
	 	}
	}


	/** 
	 * Returns the cost to play the game.
	 * pre: none
	 * post: Cost of the game has been returned.
	 */
	public double getCost() {
            return(cost);
	}
}
