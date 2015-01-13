package com.StarJump;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JPanel implements ActionListener{
	
/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
Character dude;
Image img ;
Timer time;
Rectangle floor; 				

	
	public Board() {
		dude = new Character();
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("backround.png");
		img = i.getImage();		
		
		time = new Timer(5, this);
		time.start();
		
				
		defineObjects();
		 	}
	public Color floorColor = new Color(122,52,52);
 	
	public int floorheight= 60;
	public int fps = 1000;
	public boolean objectDefine = false;
	public Thread game;
	public Board(Display f){			
	

				
		defineObjects();		
		game.start();
		}
		

		
		
	void defineObjects() { 
				floor = new Rectangle (0, FirstImportantClass.height - floorheight, FirstImportantClass.width, floorheight);
				
		 		
		 		objectDefine = true;
		 		repaint();
		 						
		 				}
	public void paint(Graphics g) {
		 		super.paint(g);	
		 		g.drawImage(img, 0, 0, null);
		 		g.drawImage(dude.getImage(), dude.getX(), dude.getY(), null);	 		
		 		
		 		if(objectDefine) {			
		 		g.setColor(floorColor);
		 		g.fillRect(floor.x, floor.y, floor.width,floor.height);
		 			
	}	
}		

		 			
	public void actionPerformed(ActionEvent e) {
				dude.move();
		 		repaint();
	 }
	private class AL extends KeyAdapter {
		public void keyReleased (KeyEvent e){	
			dude.keyReleased(e);
		}
		public void keyPressed (KeyEvent e){
			dude.keyPressed(e);
		}
	}
}
