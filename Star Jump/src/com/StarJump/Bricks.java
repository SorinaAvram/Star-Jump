package com.StarJump;

import java.awt.*;
import javax.swing.*;

public class Bricks   {
	
	Image imgb;	
	boolean breaks;	
	ImageIcon l = new ImageIcon("D://Poze/Bricks04.png");
	public  Bricks() {
		
		
	imgb = l.getImage();
		
	breaks = false;
	   
	}	
	public boolean notBreaks() {
		return breaks;
	}
	public void setBreaks (boolean breaks){
		this.breaks =breaks;
	}
}
