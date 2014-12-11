package com.StarJump;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Character {
int x, dy, y, dx;
Image still;
ImageIcon i = new ImageIcon("D:/Poze/25.png");
ImageIcon j = new ImageIcon("D:/Poze/jump.png");
	public Character (){
	
	still = i.getImage();	
	x = 10;
    y = 300;
}
	public void move() {
		x = dx * dy;
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
	}
	public void keyReleased(KeyEvent e) {
	if (key == KeyEvent.VK_LEFT){
		dy = 1;
		still = j.getImage();
	}
	}
