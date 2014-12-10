package com.StarJump;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JPanel implements ActionListener{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Board dude;
Image img ;
Timer time;
Rectangle floor; 

	public Board() {
		dude = new Board();
		setFocusable(true);
		ImageIcon i = new ImageIcon("D:/Poze/bakcround.png") ;
		img = i.getImage();
		time = new Timer(5, this);
		time.start();
	}
public Color floorColor = new Color(122,52,52);
	
	public int floorheight= 60;
	public int fps = 1000;
	public boolean objectDefine = false;
	public Thread game;
	public Board(Display f){
		
setBackground (Color.cyan);
		
		
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
		if(objectDefine) {			
			g.setColor(floorColor);
			g.fillRect(floor.x, floor.y, floor.width, 

floor.height);	
	}	
}		

	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	
	
	
}

