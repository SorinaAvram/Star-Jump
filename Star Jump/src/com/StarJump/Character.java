package com.StarJump;

import java.awt.*;
import javax.swing.*;

public class Character {
int x, dx, y;

Image still;

	public Character (){
	ImageIcon i = new ImageIcon("D:/Poze/25.png");
	still = i.getImage();
	x = 10;
    y = 172;
}
	public void move() {
		x = x + dx;
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


	}
