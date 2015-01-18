package com.StarJump;


import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 
 public class FirstImportantClass {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
 	
	public static Display f= new Display();	
	public static final int width = 600;
	public static final int height = 400;
 	public static void main (String args[]) {
			f.setSize(width, height);
			f.setResizable(false);
			f.setTitle("Star Jump");
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.add(new Board());	
			
			
			System.out.println("hello"); 			
			
			
		showMenuFrame();
 	}
 	
		// TODO Auto-generated method stub
 	
	public static void showMenuFrame() {
		JFrame f = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton playButton = new JButton("Play");
		playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showPlayFrame();
			}
		});
		panel.add(playButton);
					
		
			
		JButton highscoreButton = new JButton("Highscore");
		highscoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		highscoreButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showHighscoreFrame();
			}
		});
		panel.add(highscoreButton);
		
	
		JPanel panelInstr = new JPanel();
		panelInstr.setLayout(new GridLayout(1, 1, 0, 0));
		
		
		JButton instructionsButton = new JButton("Instructions");
		instructionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		instructionsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showInstructionsFrame();
			}
		});
		panel.add(instructionsButton);
	
		f.add(panel);
		
		f.setSize(WIDTH, HEIGHT);
		f.setResizable(false);
		f.setTitle("Star Jump - Menu");
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
 		
 	}
	
	public static void showPlayFrame() {
		Display f = new Display();
		
		f.setSize(WIDTH, HEIGHT);
		f.setResizable(false);
		f.setTitle("Star Jump");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		System.out.println("helloP");
	}
	
	public static void showHighscoreFrame() {			
		JFrame f = new JFrame();
		
		JPanel panelH= new JPanel();
		panelH.setLayout(new BoxLayout(panelH, BoxLayout.Y_AXIS));
		
		f.setSize(WIDTH, HEIGHT);
		f.setResizable(false);
		f.setTitle("Star Jump - Highscore");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		System.out.println("helloH");	
		
		
	}
	public static void showInstructionsFrame() {
		JFrame f = new JFrame();
			
		JPanel panelI = new JPanel();
		panelI.setLayout(new BoxLayout(panelI, BoxLayout.Y_AXIS));			
				
		f.setSize(WIDTH, HEIGHT);
		f.setResizable(false);
		f.setTitle("Star Jump - Instructions");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
				
		System.out.println("helloI");
	}
 }	
 
