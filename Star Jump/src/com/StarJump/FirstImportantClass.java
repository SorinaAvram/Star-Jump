package com.StarJump;

import java.awt.Color;
import javax.swing.JFrame;



public class FirstImportantClass {
	
		public static Display f= new Display();	
	public static final int width = 600;
	public static final int height = 400;
	public static void main (String args[]) {
			f=new Display();
			f.setSize(width, height);
			f.setResizable(false);
			f.setTitle("Star Jump");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setBackground(Color.cyan);
						
			
			
			System.out.println("hello"); 			
			
			
	}
	
		// TODO Auto-generated method stub
		
	}

