package com.evan.window;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EvanWin extends JFrame
{
	public EvanWin() {
		
		JButton button = new JButton("New button");
		JButton button1 = new JButton("New button");
		button1.setBounds(100, 100, 100, 100);
		getContentPane().add(button, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(null);
		panel.setBounds(200, 200, 200, 200);
		panel.add(button1);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
             EvanWin win= new EvanWin();
             win.setBounds(100, 100, 300, 300);
             win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		 win.getContentPane().setLayout(new BorderLayout());
             win.setVisible(true);
	}

}
