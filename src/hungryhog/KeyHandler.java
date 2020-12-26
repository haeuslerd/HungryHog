package hungryhog;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.Timer;
import java.util.TimerTask;

/**	
 * 
 * initlaisiere den KeyHandler
 * steuert das Schwein mithlilfe der Tastatureingabn 
 * 
 * 
 * 
 * @author dominique
 *
 */




public class KeyHandler implements KeyListener {
      
		Timer a;
	    static int keyHand =0;
  
	
	 @Override
	 public void keyPressed(KeyEvent e) {

	 
	  if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	   Game.left = true;
	   System.out.println("VK_LEFT");
	  }
	  if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	   Game.right = true;
	   System.out.println("VK_Right");
	  }

	  if (keyHand == 0) {
		  
		  //Menu
		  if (e.getKeyCode()==KeyEvent.VK_ESCAPE){ //bei Escape beende GameMode und wechsle ins Menu
			  Game.GameMode  = false;
			  Game.Menu      = true;
			
			  Game.playButton.setVisible(true); //Sichtbarkeit
			  Game.exitButton.setVisible(true);
			  
			  Game.highscoreButton.setVisible(true);
			  
			  keyHand++;
		  }
			  
		  }else if (keyHand==1){
			  
			  if (e.getKeyCode()==KeyEvent.VK_ESCAPE){ //ein weiteres Mal ESC wechselt wieder zurück in den GameMode
				  Game.GameMode  = true;
				  Game.Menu      = false;
				  
				 
				  
				  Game.playButton.setVisible(false);
				  Game.exitButton.setVisible(false);
				  
				  Game.highscoreButton.setVisible(false);
				  
				  keyHand--;
			      Actions.updater =0;
		  }
		  }
		  
	  }
	  
	
	 @Override
	 public void keyReleased(KeyEvent e) {
	 
	  if (e.getKeyCode() == KeyEvent.VK_LEFT) { //Stop der Bewegungen des Schweins für KeyReleased
	   Game.left = false;
	  }
	  if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	   Game.right = false;
	  }

	 }

	/**
	 * 
	 * definiert die Grenzen der Bewegungen nach links bzw.rechts
	 * legt die Geschwindigkeit des Schweins nach links/ nach rechts fest
	 * 
	 */
	 
	 @Override
	 public void keyTyped(KeyEvent e) {
	 }

	 public KeyHandler (){
		  a = new Timer();
		  a.scheduleAtFixedRate(new TimerTask() {
			  
			  @Override
			  public void run() {
               
				  if (Game.GameMode){
			    

			    if (Game.left == true) {
			     if (Game.x > 0) {
			      Game.x -= Game.speedleft;
			     }
			    } else if (Game.right == true) {
			     if (Game.x <= 350) {
			      Game.x += Game.speedright;
			     }
			    }

			   }
			  }
			  }, 0, 15); 
			 }}




	