package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

public class Speed9 {
	
	static Timer tick;
	
	public Speed9() {
	
		for(int a=0; a<=4;a++){
			Game.birne1[a]=100;;  //Standardposition der Gegner
			Game.birne2[a]=-150;
			
			
			
		}
	
		tick = new Timer();
		
		
		tick.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (Game.GameMode){
					
					
					for (int a = 0; a <= 4; a++) {
					     Game.birne2[a] += Game.birnenspeed[a];
					     if (Game.birne2[a] >= Game.screenheight) {
					      Game.birne1[a] = (int) (Math.random() *400);                         
					      Game.birne2[a] = -200;}}
				
					      
				}
				}
			
		},0,9);
		
		
}}