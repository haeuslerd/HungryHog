package hungryhog;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * definiert die Variablen und setzt sie auf static
 * initaliseren der BufferedImages
 * 
 * den Birnen bzw. Apple Geschwindigkeitsarrays einen Wert zuweisen
 * 
 *
 */

public class Game {

	static JFrame game; //JFrame
	static Label lb1;
	static JButton highscoreButton = new JButton(); //initialisiert die JButtons
    static JButton playButton = new JButton();
	static JButton exitButton = new JButton();
	static int x=180, y = 500;   
	static int speedleft = 5, speedright= 5;  
	static int background =0;
	static int screenheight= 600, screenwidth = 400;
	static int apple1[] = new int [10];
	static int apple2[] = new int [10];
	static int applespeed[] = new int [10];
	static int lifes =5;    
    static int apple =0; 
    static int birne1[] = new int [5];//INITIALISIERT BIRNENARRAY
	static int birne2[] = new int[5];
	static int birnenspeed[] = new int[5];
	static BufferedImage ibirne1; //initialisiert die BufferedImages
	static BufferedImage igegner1;
	static BufferedImage ibackg1; 
	static BufferedImage ischwein1;
	static boolean ate= false;
	static boolean gegessen = false;
	static boolean verloren = false;
	static boolean left = false, right = false;
	static boolean movement = false;
	static boolean GameMode = true, Menu = false;
	
	public Game() {
	
		  try {
				
	        	ibirne1  = ImageIO.read(new File("data/birne1.png"));
	        	ibackg1  = ImageIO.read(new File("data/backg1.png"));
	        	igegner1 = ImageIO.read(new File("data/gegner1.png"));
				ischwein1= ImageIO.read(new File("data/schwein1.png"));
		
			  } catch (IOException e) {
			    e.printStackTrace();
			    System.out.println("sorry we have technical issues");
				
			}
		applespeed[0] =3; applespeed[1] =7;applespeed[2] =5;applespeed[3] =6;applespeed[4] =4;
        applespeed[5] =3;applespeed[6] =7;applespeed[7] =5;applespeed[8] =6;
        applespeed[9] =4;birnenspeed[0] = 3;birnenspeed[1] = 3;birnenspeed[2] = 4;
        birnenspeed[3] = 2;birnenspeed[4] = 2; 
	}}
	
        	
        	
        	

