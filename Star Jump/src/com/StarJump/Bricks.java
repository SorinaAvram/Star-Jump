package com.StarJump;

import java.awt.*;

import javax.swing.*;

public class Bricks   {
	
	Image imgb;
	int x,  y;
	boolean full = true;
	
	ImageIcon l = new ImageIcon("D://Poze/Bricks04.png");
	public  Bricks() {
		
	    x = 250;
	    y = 220;		
		imgb = l.getImage();	
	}
}
