package com.StarJump;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Character {
int x, dy, y;

Image still;
ImageIcon i = new ImageIcon("D:/Poze/25.png");
	public Character (){
	
	still = i.getImage();	
	x = 10;
    y = 172;
}
	public void move() {
		x = x + dy;
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
		
		if (key == KeyEvent.VK_UP)
			dy = -1;
	
	}

	}
