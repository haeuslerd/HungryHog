package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * definiert die Kollisionsbedingungen für die herunterfallenden Birnen
 * mithilfe eines Timers
 *
 * @author Dominique Häusler
 *
 */


public class BirnenCrash {


	 Timer k;
     private int temp = 0; 
    
    
   public BirnenCrash() {
     
	   k = new Timer();
       k.scheduleAtFixedRate(new TimerTask(){   
   	   
      @Override
         public void run() {
         
    	  if (Game.GameMode){
          
	    for(int i=0; i<=4; i++){
            if(temp == 0){
            if(Game.x >= Game.birne1[i] - 50 && Game.x <= Game.birne1[i] + 50 &&
               Game.y >= Game.birne2[i] - 50 && Game.y <= Game.birne2[i] + 50){
    
               Game.gegessen = true;
               Game.birne2[i] = -100;
               
               
               if (Game.gegessen == true)
               {
            	   Game.lifes -=1;
            	   
            	   
              
               
               if(Game.lifes == 0){
                   Game.verloren = true;
                 
                   
               } else if(Game.lifes > 0){
                   Game.verloren = false;
    
 } 
         
 
  }
           if (temp >= 1 && temp <= 65) {
               temp++;
        } else if (temp == 66) {
                   temp = 0;
     }
 }   
            }}}
     
      }

     },0 , 15);
 
   }
   

}

