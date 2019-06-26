package com.evan.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.evan.window.classes.Evan;

public class JavaWin {

	private JFrame frame;
	private JTextField atext;
	private JTextField btext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaWin window = new JavaWin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Evan ev= new Evan();
				ev.a=Integer.parseInt( atext.getText());
				ev.b=Integer.parseInt( btext.getText());
				int c= ev.a+ev.b;
				JOptionPane.showMessageDialog(null, c);
			}
		});
		btnNewButton.setBounds(70, 59, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		atext = new JTextField();
		atext.setBounds(70, 130, 86, 20);
		frame.getContentPane().add(atext);
		atext.setColumns(10);
		
		btext = new JTextField();
		btext.setBounds(174, 130, 86, 20);
		frame.getContentPane().add(btext);
		btext.setColumns(10);
	}
}
