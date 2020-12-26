package hungryhog;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.JLabel;


public class Label extends JLabel {

    /**
	 * Zeichenklasse; zeichnet Hintergrund, Schwein, Äpfel,Birnen 
	 * für den GameMode(Spielbereich) und das Menu
	 *  
	 * Spielerklärung
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) 
	
	{
	   if(Game.GameMode){  //zeichnet den Hintergrund, das Schwein, die herunterrregnden Äpfel und die Birnen
   	
     	g.drawImage(Game.ibackg1, 0, Game.background, 400,600,null);
    
        g.drawImage(Game.ischwein1, Game.x, Game.y, 50, 50, null);
   	
       
        for(int a =0;a<=4;a++){
       	 g.drawImage(Game.ibirne1,Game.birne1[a],Game.birne2[a],25,25, null);
      }
       
      
        for (int i =0;i<=9;i++){
       	g.drawImage(Game.igegner1, Game.apple1[i], Game.apple2[i], 25,25,null);
       	
       	 }
       
              // Leben und Score werden gezeichnet
   			g.setColor(Color.WHITE);//jeweils in WEiss
   			g.getFont();
   			g.drawString("Apples: " + Game.apple, 10, 20); 
   			
   			g.drawString("Lifes: " + Game.lifes, 325, 20);
      
   		    repaint();	
   						
	   }else if (Game.Menu){   //MEnuaufruf. Zeichnet Hintergrund und setzt eine Birne und ein apfel
		   
		   g.drawImage(Game.ibackg1, 0, Game.background, 400,600,null);
          
          
          g.drawImage(Game.ibirne1,100,200,25,25, null);
          
         
          g.drawImage(Game.igegner1, 250, 400, 25,25,null);
		   
		  
          
          
          if (Game.verloren) { 
        	  g.setColor(Color.RED);  //setzt String "text" für die gesammnelten Äpfel
        	  g.setFont(new Font("Arial",Font.BOLD,30));
        	  g.drawString("YOU GOT " + Game.apple + " APPLES", 60, 100);
        	  
        	 repaint(); 
          }
	  
		      g.setColor(Color.RED);
	   	      g.setFont(new Font("Arial",Font.BOLD,30));
	   	      g.drawString("YOU GOT " + Game.apple + " APPLES", 60, 100); 
	   	      g.setColor(Color.BLACK);
	   	      g.setFont(new Font("Arial",Font.BOLD,16));
	   	      g.drawString("Das hungrige Schwein wird mit den ",20, 300);   //Erklärt das Spiel
		      g.drawString("links und rechts Pfeiltasten bewegt.", 20, 320);
		      g.drawString("Es darf nur rote Äpfel essen,", 20, 340);
		      g.drawString("da es von Birnen Bauchschmerzen kriegt. ", 20, 360);
		      g.drawString("Es darf höchstens 5 Birnen pro Spiel essen. ", 20, 380);
		      g.drawString("Um das Spiel zu starten klicke auf PLAY! ", 20, 400);
		      g.drawString("Um zu pausieren drücke ESC ", 20, 420);
		      g.drawString("Außerdem erhöht sich die Geschwindigkeit ", 20, 440);
		      g.drawString("der Birnen alle 20 Sekunden! ", 20, 460);
		      g.drawString("Um die Werte zurück zu setzen drücke EXIT! ", 20, 480);
   	  
   	  
	   }
     
   
      }}