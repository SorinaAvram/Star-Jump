package com.StarJump;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FirstImportantClass {
	
	public static JPanel pan;
	public static JLabel lab;
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
			
			pan = new JPanel();			
			
			
			lab = new JLabel ();			
			lab.setIcon(new ImageIcon("D:\\Poze\\25.png"));
			lab.setOpaque(true);
			lab.setLayout(null);
			lab.setBounds(40, 300, 58, 58);
			
			pan.add(lab);
			
			f.add(lab);
			f.add(pan);
			
			System.out.println("hello"); 			
			
			f.validate();
			
	}
	
		// TODO Auto-generated method stub
		
	}

