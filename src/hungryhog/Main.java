package hungryhog;

/**
 *  ruft die einzelnen Klassen auf und gewährt so mehr Überblick
 * 
 * 
 * die einzelnen Speed Klassen werden aufgerufen
 * 
 * 
 * @author Dominique Häusler
 *
 */


public class Main {

	
	
	public static void main (String [] args){
	
		new MenuFrame();
		new Game();
		new KeyHandler();
		new Apples();
		new Label();
		new AppleCrash();
		new BirnenCrash();
		new Abbruch();
		new Actions();
		
		/*
		 * Steigerung der Geschwindigkeit
		 * 
		 */
		
		new Speed9();  //Startzustand der Birnen
		new Speed8();  //Erhöhung der Geschwindigkeit jeweils um 1 alle 20sek
		new Speed7();
		new Speed5();
		new Speed3();
		new Speed2();
		new Speed1();
		new Speed0();
		
		

	 
	}
}