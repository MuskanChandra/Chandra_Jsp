package com.evan.window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.evan.window.classes.ButtonEventListener;
import com.evan.window.classes.EvanHelper;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EventFrame extends JFrame
	{

		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private final ButtonGroup buttonGroup = new ButtonGroup();

		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
			{
				EventQueue.invokeLater(new Runnable()
					{
						public void run()
							{
								try
									{
										EventFrame frame = new EventFrame();
										frame.setVisible(true);
									}
								catch (Exception e)
									{
										e.printStackTrace();
									}
							}
					});
			}

		/**
		 * Create the frame.
		 */
		public EventFrame()
			{
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 571, 483);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);

				JPanel panel = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				panel.setBackground(new Color(139, 69, 19));
				panel.setBounds(10, 113, 408, 33);
				contentPane.add(panel);
				JCheckBox chckbxMomo = new JCheckBox("momo");
				JLabel lblLbl = new JLabel("lbl");
				lblLbl.setForeground(new Color(250, 240, 230));
				panel.add(lblLbl);
				JCheckBox chowchec = new JCheckBox("chowmien");
				chckbxMomo.addItemListener(new ItemListner(lblLbl));
				chowchec.addItemListener(new ItemListner(lblLbl));

				panel.add(chckbxMomo);

				panel.add(chowchec);
				JButton btnCheck = new JButton("check");
				btnCheck.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent arg0)
							{
								List<String> cs = new ArrayList<String>();
								if (chckbxMomo.isSelected())
									{
										cs.add(chckbxMomo.getText());
									}
								if (chowchec.isSelected())
									{
										cs.add(chowchec.getText());
									}
								if (cs.size() < 1)
									{
										show("you have not selected any thing");
										return;
									}
								StringBuilder sb = new StringBuilder();
								sb.append("You have chosen");
								sb.append("\n");
								for (String st : cs)
									{
										sb.append(st);
										sb.append("\n");
									}
								show(sb);

							}
					});
				panel.add(btnCheck);

				JButton btnEventbtn = new JButton("eventbtn");
				btnEventbtn.setBounds(384, 387, 77, 23);
				contentPane.add(btnEventbtn);

				JPanel panel_1 = new JPanel();
				panel_1.setBackground(UIManager.getColor("TextArea.selectionBackground"));
				FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
				flowLayout_1.setAlignment(FlowLayout.LEADING);
				panel_1.setBounds(10, 157, 244, 33);
				contentPane.add(panel_1);

				JRadioButton rdbtnMale = new JRadioButton("male");
				rdbtnMale.setSelected(true);
				buttonGroup.add(rdbtnMale);
				panel_1.add(rdbtnMale);

				JRadioButton rdbtnFemale = new JRadioButton("female");
				buttonGroup.add(rdbtnFemale);
				panel_1.add(rdbtnFemale);

				JButton btnSex = new JButton("sex");
				panel_1.add(btnSex);
				btnSex.addActionListener(new genderbtnlistener(rdbtnMale, rdbtnFemale));

				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(10, 201, 318, 140);
				contentPane.add(tabbedPane);

				JPanel panel_2 = new JPanel();
				panel_2.setBackground(new Color(128, 128, 0));
				tabbedPane.addTab("first panel", null, panel_2, null);
				tabbedPane.setForegroundAt(0, new Color(210, 105, 30));
				tabbedPane.setBackgroundAt(0, new Color(139, 0, 0));

				JLabel lblNewLabel = new JLabel("New label");
				panel_2.add(lblNewLabel);

				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(0, 0, 0));
				tabbedPane.addTab("New tab", null, panel_3, null);
				tabbedPane.setBackgroundAt(1, new Color(0, 255, 0));

				JButton btnNewButton = new JButton("New button");
				panel_3.add(btnNewButton);

				JPanel panel_4 = new JPanel();
				panel_4.setBackground(new Color(0, 0, 255));
				tabbedPane.addTab("New tab", null, panel_4, null);
				tabbedPane.setBackgroundAt(2, new Color(34, 139, 34));

				JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
				panel_4.add(chckbxNewCheckBox);

				JPanel panel_5 = new JPanel();
				panel_5.setBackground(new Color(255, 20, 147));
				tabbedPane.addTab("New tab", null, panel_5, null);
				tabbedPane.setBackgroundAt(3, new Color(153, 50, 204));

				JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
				panel_5.add(rdbtnNewRadioButton);

				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(143, 188, 143));
				panel_6.setBounds(274, 157, 271, 33);
				contentPane.add(panel_6);

				JComboBox<String> comboBox = new JComboBox<String>();
				comboBox.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								@SuppressWarnings("unchecked")
								JComboBox<String> jComboBox = (JComboBox<String>) e.getSource();
								String value = jComboBox.getSelectedItem().toString();
								Color c = null;
								switch (value)
									{
									case "red":
										c = Color.red;
										break;
									case "blue":
										c = Color.blue;
										break;
									case "yellow":
										c = Color.yellow;
										break;

									}
							getContentPane().setBackground(c);
							}
					});
				comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "None","red", "blue", "yellow" }));
			comboBox.setEditable(true);
			comboBox.setSelectedItem("Set Background Color");
				panel_6.add(comboBox);
				
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBounds(0, 0, 97, 21);
				contentPane.add(menuBar);
				
				JMenu menua = new JMenu("A");
				menuBar.add(menua);
				
				JMenuItem mntmNewMenuItem = new JMenuItem("A1");
				menua.add(mntmNewMenuItem);
				
				JMenuItem mntmNewMenuItem_1 = new JMenuItem("A2");
				mntmNewMenuItem_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						show("menu clicked");
					}
				});
				menua.add(mntmNewMenuItem_1);
				
				JMenuItem mntmNewMenuItem_2 = new JMenuItem("A3");
				menua.add(mntmNewMenuItem_2);
				
				JMenu mnNewMenu_1 = new JMenu("B");
				menuBar.add(mnNewMenu_1);
				
				JMenuItem mntmNewMenuItem_3 = new JMenuItem("B1");
				mnNewMenu_1.add(mntmNewMenuItem_3);
				
				JMenu mnNewMenu_2 = new JMenu("C");
				menuBar.add(mnNewMenu_2);
				
				JMenuItem mntmNewMenuItem_4 = new JMenuItem("C1");
				mnNewMenu_2.add(mntmNewMenuItem_4);
				
				JMenuItem mntmNewMenuItem_5 = new JMenuItem("C2");
				mnNewMenu_2.add(mntmNewMenuItem_5);
				btnEventbtn.addActionListener(new ButtonEventListener());
			}

		public void show(Object o)
			{
				JOptionPane.showMessageDialog(null, o.toString());
			}
	}

class genderbtnlistener implements ActionListener
	{
		JRadioButton btnmale;
		JRadioButton btnfemale;

		public genderbtnlistener(JRadioButton rdbtnMale, JRadioButton rdbtnFemale)
			{
				this.btnfemale = rdbtnFemale;
				this.btnmale = rdbtnMale;

			}

		@Override
		public void actionPerformed(ActionEvent e)
			{
				if (btnmale.isSelected())
					{
						EvanHelper.show(btnmale.getText());
					}
				if (btnfemale.isSelected())
					{
						EvanHelper.show(btnfemale.getText());
					}
			}

	}

class ItemListner implements ItemListener
	{
		JLabel label;

		public ItemListner(JLabel label)
			{
				this.label = label;
			}

		@Override
		public void itemStateChanged(ItemEvent e)
			{
				label.setText(((JCheckBox) e.getItemSelectable()).getText()
						+ (e.getStateChange() == 1 ? ":  checked" : ":  unchecked"));

			}

	}
