package com.StarJump;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Character {
	
int x, dy, y, dx;
Image still;
int width = 74;
int height = 72;
int halfW, halfH;
Rectangle bounds;

ImageIcon i1 = new ImageIcon("D://Poze/25.png");
ImageIcon j = new ImageIcon("D://Poze/jump.png");

	public Character (){
	
	still = i1.getImage();	
	x = 260;
    y = 290;
    
    halfW = width / 2;
	halfH = height / 2;
	
	bounds = new Rectangle(width, height);
	
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
		if (key == KeyEvent.VK_LEFT){
		dx = -1;
		still = i1.getImage();
	}
		if (key == KeyEvent.VK_RIGHT){
		dx = 1;
		still = i1.getImage();
	}
		
		if(key == KeyEvent.VK_UP){
			dy =1;
		still = j.getImage();
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
		dx = 0;
		
		}
		if (key == KeyEvent.VK_RIGHT){
		dx = 0;
		}
		if(key == KeyEvent.VK_UP){
		dy =0;
		still = i1.getImage();
		
		}
		
	}
	public Rectangle getBounds() {
	bounds.setLocation(x - halfW, y + halfH);		
		return bounds;
	}
		
}
