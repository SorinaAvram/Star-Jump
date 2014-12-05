package com.StarJump;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class dunno extends JPanel implements Runnable{
	public Rectangle floor;
	
	public int floorh= 20;
	public int fps = 1000;
	public boolean objectDefine = false;
	public Thread game;
	public dunno(Display f){
		setBackground (Color.blue);
		
		defineObjects();
		
		game = new Thread (this);
		game.start();
	}
	void defineObjects() { 
		floor = new Rectangle (-10, FirstImportantClass.h-floorh , FirstImportantClass.w+10, floorh);
		
		objectDefine = true;
		
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		if(objectDefine) {			
			g.setColor(Color.orange);
			g.fillRect(floor.x, floor.y, floor.width, floor.height);
		}
	}
	public void fpsSetter() {
		try{
			game.sleep(fps/1000);
		}catch(Exception e){	
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
