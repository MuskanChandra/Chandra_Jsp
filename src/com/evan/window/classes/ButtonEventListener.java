package com.evan.window.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonEventListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, e.getSource().getClass().getName());

			}

	}

