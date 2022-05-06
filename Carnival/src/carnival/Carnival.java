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
public class Carnival {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameBooth balloonDartToss = new GameBooth(2,"tiger plush", "sticker");
	GameBooth ringToss = new GameBooth(2,"bear keychain", "pencil");
	GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
	Player shonda = new Player(5);
	Player luis = new Player(3);

	System.out.print("Shonda goes to Balloon Dart Toss. ");
	System.out.println(shonda.play(balloonDartToss));
	System.out.print("Luis goes to Ring Toss. ");
	System.out.println(luis.play(ringToss));

	System.out.print("Shonda goes to Ring Toss. ");
	System.out.println(shonda.play(ringToss));

	System.out.print("Luis goes to Break A Plate. ");
	System.out.println(luis.play(breakAPlate));

	System.out.println("Shonda won: " + shonda.showPrizes());
	System.out.println("Luis won: " + luis.showPrizes());
    }
    
}
