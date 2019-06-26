package com.evan.window;

import java.awt.EventQueue;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import com.evan.database.EvanDatabase;

import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;


public class NewWin {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField idtext;
	private JTextField firsttext;
	private JTextField lasttext;
	private JTextField agetext;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWin window = new NewWin();
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
	public NewWin() {
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
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EvanDatabase ed= new EvanDatabase();
			try {
				table.setModel(DbUtils.resultSetToTableModel(ed.get()));
//			     JScrollPane pane = new JScrollPane(table);
//		           frame.getContentPane().add(pane);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(10, 222, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		
		
		scrollPane.setBounds(10, 11, 161, 200);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int row = table.getSelectedRow();
				 Integer id =(Integer) table.getValueAt(row, 0);
				// JOptionPane.showMessageDialog(null, id.toString());
				try {
				ResultSet rs=	EvanDatabase.getsingle(id);
			rs.next();
			idtext.setText(String.valueOf(rs.getInt("id")));
			firsttext.setText(rs.getString("first"));
			lasttext.setText(rs.getString("last"));
			agetext.setText(String.valueOf(rs.getInt("age")));
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		
		idtext = new JTextField();
		idtext.setEditable(false);
		idtext.setBounds(299, 11, 86, 20);
		frame.getContentPane().add(idtext);
		idtext.setColumns(10);
		
		firsttext = new JTextField();
		firsttext.setBounds(299, 42, 86, 20);
		frame.getContentPane().add(firsttext);
		firsttext.setColumns(10);
		
		lasttext = new JTextField();
		lasttext.setBounds(299, 73, 86, 20);
		frame.getContentPane().add(lasttext);
		lasttext.setColumns(10);
		
		agetext = new JTextField();
		agetext.setBounds(299, 104, 86, 20);
		frame.getContentPane().add(agetext);
		agetext.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(243, 17, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FirstName");
		lblNewLabel_1.setBounds(221, 48, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel LastName = new JLabel("LastName");
		LastName.setBounds(221, 79, 68, 14);
		frame.getContentPane().add(LastName);
		
		JLabel Age = new JLabel("Age");
		Age.setBounds(243, 110, 46, 14);
		frame.getContentPane().add(Age);
		
		JButton SaveBtn = new JButton("Save");
		SaveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(idtext.getText().length()<1)
				{
					int rs=	EvanDatabase.savetable(firsttext.getText(),lasttext.getText(),Integer.parseInt(agetext.getText()));
					JOptionPane.showMessageDialog(null, rs);
				}
				else
				{
					int rs=	EvanDatabase.updatetable(Integer.parseInt(idtext.getText()),firsttext.getText(),lasttext.getText(),Integer.parseInt(agetext.getText()));
JOptionPane.showMessageDialog(null, rs);
				}
			}
		});
		SaveBtn.setBounds(296, 139, 89, 23);
		frame.getContentPane().add(SaveBtn);
		
		
	}
}
