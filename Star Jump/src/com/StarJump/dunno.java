package com.StarJump;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class dunno extends JPanel implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rectangle floor;
		
	

	public Color floorColor = new Color(122,52,52);
	
	public int floorheight= 60;
	public int fps = 1000;
	public boolean objectDefine = false;
	public Thread game;
	public dunno(Display f){
		setBackground (Color.cyan);
		
		defineObjects();
		
		game = new Thread (this);
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
			g.fillRect(floor.x, floor.y, floor.width, floor.height);
			System.out.println("Object define is true");
		}
	}
	public void fpsSetter() {
		try{
			Thread.sleep(fps/1000);
		}catch(Exception e){	
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
