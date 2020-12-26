package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

	public class Speed7 {

		Timer tick;
	

	public Speed7() {
		
		
			

			for(int i=0; i<=4;i++){
				Game.birne1[i]=100;  //Standardposition der Gegner
				Game.birne2[i]=-150;
				
				
				
			}
			
			
			tick = new Timer();
			tick.schedule(new TimerTask(){
				
				@Override
				public void run() {
					
					if (Game.GameMode){
					
					for (int i = 0; i <= 4; i++) {
					     Game.birne2[i] += Game.birnenspeed[i];
					     if (Game.birne2[i] >= Game.screenheight) {
					     Game.birne1[i] = (int) (Math.random() *400);                         
					      Game.birne2[i] = -200;
					      
					      
					      
					    }
					   }
					    
					}
					
				}
			
			  },40000,7);
		}}


			



