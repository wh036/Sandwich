package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JList;
import data.Calculation;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Screen03 extends JPanel {
	private MainFrame mainFrame;
	
	private Calculation[] calculations;
	
	public Screen03(MainFrame main)
	{	
		this.mainFrame = main;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 261);
		add(panel);
		
		JLabel label = new JLabel("Picture");
		label.setBounds(161, 34, 72, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Chicken Sandwich");
		label_1.setBounds(140, 72, 93, 14);
		panel.add(label_1);
		
		JCheckBox checkBox = new JCheckBox("Cucumber");
		checkBox.setBounds(90, 110, 97, 23);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("olive");
		checkBox_1.setBounds(198, 110, 97, 23);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("BBQ sauce");
		checkBox_2.setBounds(90, 146, 97, 23);
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Mayonise");
		checkBox_3.setBounds(198, 146, 97, 23);
		panel.add(checkBox_3);
		
		JLabel label_2 = new JLabel("Bread Type:");
		label_2.setBounds(88, 190, 72, 14);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(177, 187, 100, 20);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Quantity:");
		label_3.setBounds(83, 215, 46, 14);
		panel.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(160, 218, 52, 20);
		panel.add(comboBox_1);
		
		JButton button = new JButton("Add to Cart");
		button.setBounds(224, 218, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("View Cart");
		button_1.setBounds(335, 11, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Menu");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMenuScreen();
			}
		});
		button_2.setBounds(224, 11, 89, 23);
		panel.add(button_2);
		
		this.populateCalculationList();
	}
	
	private void populateCalculationList()
	{
		this.calculations = this.mainFrame.getController().getAllCalculations();
		DefaultListModel model = new DefaultListModel();
		for(int i=0; i < calculations.length; i++)
		{
			Calculation op = calculations[i];
			model.addElement(op.getOperand1() + " " + op.getOp() + " " + op.getOperand2());
		}
	}
	private void showMenuScreen()
	{
	this.mainFrame.showMenuScreen();
	}
}
