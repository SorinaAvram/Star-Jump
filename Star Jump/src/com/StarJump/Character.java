package com.StarJump;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Character {
	
int x, dy, y, dx;
Image still;

ImageIcon i = new ImageIcon("25.png");
	public Character (){
	
	still = i.getImage();	
	x = 10;
    y = 180;
}
	public void move() {
		x = x + dx ;
}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
}
	public Image getImage(){
		return still;
}
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT);
		dx = -1;
		
		if (key == KeyEvent.VK_RIGHT);
		dx = 1;
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT);
		dx = 0;
		
		if (key == KeyEvent.VK_RIGHT);
		dx = 0;
	}
}
