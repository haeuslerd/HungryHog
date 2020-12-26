package hungryhog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Definiert die Kollisionsbedingungen für die herunterfallenden Äpfel
 * mithilfe eines Timers
 * 
 * 
 * @author Dominique Häusler
 *
 */


public class AppleCrash {
 
     Timer a;
     private int temp = 0; 
     
     public AppleCrash() {
         a = new Timer();
         a.scheduleAtFixedRate(new TimerTask(){   
    	   
    	   @Override
           public void run() {
        
    		   if (Game.GameMode) {  //für GameMode initaliseire die Kollision Apfel_Schwein
    
	  
    			   for(int i=0; i<=9; i++){
          
    				   if(temp == 0){
         
    					   if(Game.x >= Game.apple1[i] - 50 && Game.x <= Game.apple1[i] + 50 &&
             
    							   Game.y >= Game.apple2[i] - 50 && Game.y <= Game.apple2[i] + 50){
       
                
    						   Game.ate = true;
               
    						   Game.apple2[i] = -100;
                 
                 
                
    						   if (Game.ate == true) {
                	
    							   Game.apple+=10;
                	
                	  
    
     }
     if (temp >= 1 && temp <= 65) {
         temp++;
        } else if (temp == 66) {
         temp = 0;
        }
    }    
   }
    			   }}}  	  
    			  
  },0 , 9);}}