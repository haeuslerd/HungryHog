package hungryhog;

import java.util.Timer;
import java.util.TimerTask;


/**
 * 
 * legt die Standardposition der Äpfel dar
 * Geschwindigkeit der herunterfallenden Äpfel wird festgelegt
 * 
 * @author dominique
 *
 */



public class Apples {

	Timer m;
	
	public Apples() {
		for(int i=0; i<=9;i++){
			Game.apple1[i]=(int) (Math.random()/385);  //Standardposition der Gegner
			Game.apple2[i]=-200;
		
		}

		m = new Timer();
		m.scheduleAtFixedRate(new TimerTask(){
			
			@Override
			public void run() {
				
				if (Game.GameMode) {       //ruft Äpfel nur im GameMode auf
				
				for (int i = 0; i <= 9; i++) {
				     Game.apple2[i] += Game.applespeed[i];
				     if (Game.apple2[i] >=600) {
				      Game.apple1[i] = (int) (Math.random() *400);                         
				      Game.apple2[i] = -200;
				      
				     
				      
				     }
				    }
				    
				
				
				   }}
				   
				  }, 0, 12);
	
	}
}
