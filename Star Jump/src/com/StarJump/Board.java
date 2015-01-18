package com.StarJump;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JPanel implements ActionListener,Runnable{

	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Character dude;
Image img ;
Timer time;
Rectangle floor; 
int val = 290;
Thread animator;

	
	public Board() {
		dude = new Character();
				
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("D://Poze/backround.png");		
		img = i.getImage();		
		
		time = new Timer(5, this);
		time.start();
		
				
		defineObjects();
		 	}
	public Color floorColor = new Color(122,52,52);
 	
	public int floorheight= 60;
	public int fps = 60;
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
	boolean k=false;
	public void paint(Graphics g) {
				if (dude.dy ==1 && k==false){
					k=true;
					animator = new Thread(this);
					animator.start();
				}
		
		 		super.paint(g);			
		 		
		 		if(objectDefine) {			
		 		g.setColor(floorColor);
		 		g.fillRect(floor.x, floor.y, floor.width,floor.height);
		 		g.drawImage(img, 0, 0, this);
		 		g.drawImage(dude.getImage(), dude.getX(), val, this);	
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
	@Override
	public void run() {
		long beforeTime, timeDiff, sleep;
		
		beforeTime = System.currentTimeMillis();
		while(done==false) {
			cycle();
			timeDiff= System.currentTimeMillis() - beforeTime;
			sleep = 10 - timeDiff;
			if (sleep < 0)
				sleep=2;
			try {
				Thread.sleep(sleep);				
			}catch(Exception e){
		}
			beforeTime=System.currentTimeMillis();
	}
		done = false;
		peak = false;
		k=false;
	}
	boolean peak = false;
	boolean done = false;
	public void cycle() {
		if (peak == false)
			val --; 
		if(val ==240)
			peak=true;
		if(peak == true && val <=290)
			val++;
		if (val==290)
			done=true;
}
}
