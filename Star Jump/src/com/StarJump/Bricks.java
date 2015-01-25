package com.StarJump;

import java.awt.*;
import javax.swing.*;

public class Bricks   {
	
	Image imgb;	
	boolean breaks;	
	ImageIcon l = new ImageIcon("D://Poze/Brick04.png");
	int width = 70;
	int height = 25;
	int xPos,yPos;
	
	
	Rectangle bounds;
	
	public  Bricks(int x, int y ) {
		xPos = 180;
		yPos = 290;
	 
		int hW = width / 2;
		int hH = height / 2;
		
		imgb = l.getImage();
		
	bounds = new Rectangle(xPos - hW, yPos + hH, width, height);	
	
		
	breaks = false;
	   
	}	
	public Image getImage()
	{
		return imgb;
	}
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
	public boolean notBreaks() {
		return breaks;
	}
	public void setBreaks (boolean breaks){
		this.breaks =breaks;
	}
	public Rectangle getBounds(){
	
		return bounds;
	}
		
	}


