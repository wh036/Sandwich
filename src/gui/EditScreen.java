package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import data.Calculation;

import java.awt.Font;

public class EditScreen extends JPanel {
	private MainFrame mainFrame;
	private JTextField textField;
	
	private int index;
	private Calculation calc;
	
	public EditScreen(MainFrame main, int ind, Calculation cal)
	{
		this.mainFrame = main;
		this.index = ind;
		this.calc = cal;
		setLayout(null);
		
		JButton btnAdd = new JButton("Show History");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 showMainPage();
			 }
			 });

	}
	
	private void showMainPage()
	{
		this.mainFrame.showScreen03();
	}
}
