package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Screen02 extends JPanel {
	private MainFrame mainFrame;
	
	public Screen02(MainFrame main)
	{
		this.mainFrame = main;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 261);
		add(panel);
		
		JLabel label_1 = new JLabel("Beef Sandwich");
		label_1.setBounds(147, 82, 93, 14);
		panel.add(label_1);
		
		JCheckBox checkBox = new JCheckBox("Cucumber");
		checkBox.setBounds(68, 114, 97, 23);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("olive");
		checkBox_1.setBounds(199, 114, 97, 23);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("BBQ sauce");
		checkBox_2.setBounds(68, 152, 97, 23);
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Mayonise");
		checkBox_3.setBounds(199, 152, 97, 23);
		panel.add(checkBox_3);
		
		JLabel label_2 = new JLabel("Bread Type:");
		label_2.setBounds(68, 201, 72, 14);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 198, 100, 20);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Quantity:");
		label_3.setBounds(119, 226, 46, 14);
		panel.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(175, 229, 52, 20);
		panel.add(comboBox_1);
		
		JButton button = new JButton("Add to Cart");
		button.setBounds(245, 222, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Menu");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMenuScreen();
			}
		});
		button_1.setBounds(245, 11, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("View Cart");
		button_2.setBounds(344, 11, 89, 23);
		panel.add(button_2);
	}
	private void showMenuScreen()
	{
	this.mainFrame.showMenuScreen();
	}
}
