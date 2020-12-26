package hungryhog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;






public class MenuFrame {
  
	
	/**
	 * 
	 * Ruft JFrame, definiert Namen,Größe etc.
	 * 
	 * inittalisert die einzelnenen Buttons und setzt sie erst visible
	 * wenn Menu aufgerufen wird
	 * 
	 * 
	 */
	
	
	
	public MenuFrame(){
	
	
		Game.game = new JFrame();
	    Game.game.setSize(400,600);
	    Game.game.setLocationRelativeTo(null);
	    Game.game.setLayout(null);
	    Game.game.setTitle("Hungry Hog");  //legt Titel des Spiels fest
	    Game.game.addKeyListener(new KeyHandler());
	    Game.game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	    Game.game.setResizable(false);
	    Game.game.requestFocus();
	    
	 
	   Game.playButton.setText("PLAY");
	   Game.game.add(Game.playButton);
	   Game.playButton.setBounds(50, 70, 300, 150); //legt Position fest
	   Game.playButton.setVisible(false);
	   Game.playButton.addActionListener(new Actions());
	   Game.playButton.setBackground(Color.BLACK); //legt Farbe fest
	   Game.playButton.setFont(new Font("Arial",Font.BOLD,30)); //Fettdruck in Größe 30
	   Game.playButton.setBorder(null);
	
	
	   
	   Game.exitButton.setText("EXIT");
	   Game.game.add(Game.exitButton);
	   Game.exitButton.setBounds(50, 70, 300, 350);
	   Game.exitButton.setVisible(false);
	   Game.exitButton.addActionListener(new Actions());
	   Game.exitButton.setBackground(Color.BLACK);
	   Game.exitButton.setFont(new Font("Arial",Font.BOLD,30));
	   Game.exitButton.setBorder(null);
	  
	 
	   Game.highscoreButton.setText("HIGHSCORE");
	   Game.game.add(Game.highscoreButton);
	   Game.highscoreButton.setBounds(50, 70, 300, 250);
	   Game.highscoreButton.setVisible(false);
	   Game.highscoreButton.addActionListener(new Actions());
	   Game.highscoreButton.setBackground(Color.BLACK);
	   Game.highscoreButton.setFont(new Font("Arial",Font.BOLD,30));
	   Game.highscoreButton.setBorder(null);
	   
	 
	   
	   Game.lb1= new Label();
	   Game.lb1.setBounds(0, 0, 400, 600); //initialisiert Label auf dem gezeichnet wird
	   
	   Game.game.add(Game.lb1);
	   Game.game.setVisible(true);

	
		}
		
		
		
	

	
	}