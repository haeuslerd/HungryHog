package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class Abbruch {
    Timer l;
    private int tada = 0;
   
    
    /**
     *  Definiert die Abbruchbedingungegn
     * setzt Leben nach Abbruch wieder auf 5
     * 
     * 
      */
    
	public Abbruch(){
		
		l= new Timer();
		l.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
		
				
				if (Game.verloren) {
					
					if (tada >= 0 && tada <=55){
						tada++;
						
					}    if (tada ==56){
						System.out.println("GAME OVER");
						
						Game.GameMode = false;  //kein Spielaufruf
						Game.Menu     =true;    //Menuaufruf
						Game.playButton.setVisible(true); //Sichtbarkeit
						Game.exitButton.setVisible(true); 
						Game.highscoreButton.setVisible(true);
						
					    Game.playButton.requestFocus();
						Game.exitButton.requestFocus();
						
						Game.highscoreButton.requestFocus();
						Game.game.requestFocus();
						
						
						
						
						for (int i = 0; i <= 4; i++) {       //lege die Standardposition fest
						     Game.birne2[i] += Game.birnenspeed[i];
						     if (Game.birne2[i] >= 600) {
						     Game.birne1[i] = 20;                         
						      Game.birne2[i] = -200;
						
						
					}
						        Game.birnenspeed[0] = 3;  //initialisiere die Werte für das Array der Größe 5
						        Game.birnenspeed[1] = 3;
						        Game.birnenspeed[2] = 4;
						        Game.birnenspeed[3] = 2;
						        Game.birnenspeed[4] = 2;
				      
						 for (int a = 0;a<=9;a++) {  //lege die Standardposition fest für Appel
				    	  Game.apple2[a] = 0;
				    	   
				    	   
				       }
						 
						 for (int a = 0; a <= 9; a++) {
						     Game.apple2[a] += Game.applespeed[a];
						     if (Game.apple2[a] >=600) {
						      Game.apple1[a] = (int) (Math.random() *400);   //random Wert * 400                       
						      Game.apple2[a] = -200;} 
						      
				
					 
						     Game.lifes=5 ; //setze Leben wieder zurück auf 5 und starte von vorne
						
					   
						   Game.verloren = false;  
						}
						
						}
			
					}
					 
				}		}
			
					}, 0, 14);
				}}

	
	
		
