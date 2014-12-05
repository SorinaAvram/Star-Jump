package com.StarJump;

import java.awt.Color;

import javax.swing.JFrame;

public class FirstImportantClass {
	
	public static Display f = new Display();	
	public static int w = 600;
	public static int h = 400;
	public static void main (String args[]) {
			f=new Display();
			f.setSize(w, h);
			f.setResizable(false);
			f.setTitle("Star Jump");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setBackground(Color.BLUE);
	}
}
