package com.StarJump;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JPanel implements ActionListener, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Character dude;
	Image img;
	Timer time;
	Rectangle floor;
	int val = 290;
	Thread animator;
	Bricks b1;
	boolean lost = false;

	public Board() {
		dude = new Character();
		b1 = new Bricks(180, 290);
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("backround.png");
		img = i.getImage();

		time = new Timer(5, this);
		time.start();

		defineObjects();
	}

	public Color floorColor = new Color(122, 52, 52);

	public int floorheight = 60;
	public int fps = 60;
	public boolean objectDefine = false;
	public Thread game;

	public Board(Display f) {

		defineObjects();
		game.start();
	}

	void defineObjects() {
		floor = new Rectangle(0, FirstImportantClass.height - floorheight,
				FirstImportantClass.width, floorheight);

		objectDefine = true;
		repaint();

	}

	boolean k = false;

	public void paint(Graphics g) {
		if (lost)
			System.exit(0);
		if (dude.dy == 1 && k == false) {
			k = true;
			animator = new Thread(this);
			animator.start();
		}

		super.paint(g);

		if (objectDefine) {
			g.setColor(floorColor);
			g.fillRect(floor.x, floor.y, floor.width, floor.height);
			g.drawImage(img, 0, 0, this);
			g.drawImage(dude.getImage(), dude.getX(), val, this);
			g.drawImage(b1.getImage(), b1.getX(), b1.getY(), this);
		}
	}

	public void actionPerformed(ActionEvent e) {		
		dude.move();
		repaint();
	}

	public void checkCollision() {

		Rectangle r1 = b1.getBounds();
		Rectangle r2 = dude.getBounds();
		
		System.out.println(r2.getX()+ r2.getY() + r2.width + r2.height);
		System.out.println(r1.getX()+ r1.getY() + r1.width + r1.height);
		
		// Gotta add && b1.notBreaks() for the bricks that will break (doh!)
		if (r1.intersects(r2) ) {
									
			done = true;
            dude.y = b1.getY() + (dude.height/2);
            
       //To fix this !! 
            dude.x = b1.getX() + (b1.width /2);
            
            System.out.println("GIZZY HIT THE BRICK");
		}	
	}

	private class AL extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			dude.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			dude.keyPressed(e);
		}
	}

	@Override
	
	// Thread for jumping
	
	public void run() {
		long beforeTime, timeDiff, sleep;

		beforeTime = System.currentTimeMillis();
		while (done == false) {
			cycle();
			checkCollision();
			
			timeDiff = System.currentTimeMillis() - beforeTime;
			sleep = 10 - timeDiff;
			if (sleep < 0)
				sleep = 2;
			try {
				Thread.sleep(sleep);

			} catch (Exception e) {
				
			}
			beforeTime = System.currentTimeMillis();
		}
		done = false;
		peak = false;
		k = false;

	}

	boolean peak = false;
	boolean done = false;
	
	public void cycle() {

		if (peak == false)
			val--;
			dude.y=val;
			
		if (val == 210)
			peak = true;
		if (peak == true && val <= 290)
			val++;
			dude.y=val;
			
		if (val == 290)
			done = true;
	}

}
