package hungryhog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Ruft die Spieloberfläche auf
 * Aktiviert die Buttons
 * 
 * 
 * @author Dominique Häusler
 *
 */

public class Actions implements ActionListener {

  Timer t;
  static int updater = 0;
	
  
  @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
     
		
		if(e.getSource()==Game.playButton) {
			
			Game.GameMode  = true; //Spieloberfläche aufrufen
			Game.Menu      = false; //kein Menu
			Game.playButton.setVisible(false);//Sichtbarkeit
			Game.exitButton.setVisible(false);
			Game.highscoreButton.setVisible(false);
			Game.game.requestFocus();
		
		   }
		
		  else if (e.getSource() ==Game.exitButton) {  //Bei exitButton Spiel beenden
			         System.exit(0);
			         
		   
		   }
		 
			  else if (e.getSource() == Game.playButton) { //setzte apple wieder auf 0
			   Game.apple =0;
			   
		   }
	
	}
    
  /**     
   * 
   * Timer um Menu aufzurufen
   * 
   * 
   */
  
  
  public Actions() {
   	    t = new Timer();
   	    t.scheduleAtFixedRate(new TimerTask(){

   			@Override
   			public void run() {
   				// TODO Auto-generated method stub
   				
   				if (Game.Menu){
   					
   					if(updater == 0){
   					    Game.playButton.requestFocus(); //setze jeweils den request focus auf die eizelnen Buttons
   					    Game.exitButton.requestFocus();
   					    Game.highscoreButton.requestFocus();
   					   
   					    
   					   
   						updater++;  //erhöhe den updater
   						
   					}else if (updater ==1){
   						Game.game.requestFocus();
   						
   					}
   					
   				}
   			}
   			
   			
       },0, 1);
   		
   	 
    }   

	
}
