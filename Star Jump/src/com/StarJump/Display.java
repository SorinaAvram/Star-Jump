package com.StarJump;

import java.awt.GridLayout;

import javax.swing.JFrame;


public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Board panel;
	
	public Display() {
		 
		setLayout(new GridLayout(1, 1, 0, 0));
		add (panel);
	}
}