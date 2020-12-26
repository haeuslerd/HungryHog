package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

public class Speed2 {
	

		Timer tick;
	

	public Speed2() {
		
		
			

			for(int a=0; a<=4;a++){
				Game.birne1[a]=100;   //Standardposition der Gegner
				Game.birne2[a]=-150;
				
				
				
			}
			
			
			tick = new Timer();
			tick.schedule(new TimerTask(){
				
				@Override
				public void run() {
					
					if (Game.GameMode){
					
					for (int a = 0; a <= 4; a++) {
					     Game.birne2[a] += Game.birnenspeed[a];
					     if (Game.birne2[a] >= 600) {
					     Game.birne1[a] = (int) (Math.random() *400);                         
					      Game.birne2[a] = -200;
					      
					      
					      
					    }
					   }
					    
					}
					
				}
			
			  },120000,4);
		}}

