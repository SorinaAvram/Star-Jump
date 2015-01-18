package com.StarJump;

import java.awt.*;

import javax.swing.*;

public class Bricks   {
	
	Image imgb;
	int x,  y;
	ImageIcon l = new ImageIcon("D://Poze/Bricks04.png");
	public  Bricks(int x, int y) {
		
	    this.x = x;
	    this.y = y;		
		imgb = l.getImage();	
	}
}
