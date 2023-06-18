package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Screen01 extends JPanel {
	private MainFrame mainFrame;
	
	/**
	 * @param main
	 */
	public Screen01(MainFrame main)
	{
		this.mainFrame = main;
		setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("Cucumber");
		checkBox.setBounds(53, 103, 97, 23);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("olive");
		checkBox_1.setBounds(223, 103, 97, 23);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("BBQ sauce");
		checkBox_2.setBounds(53, 149, 97, 23);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Mayonise");
		checkBox_3.setBounds(223, 149, 97, 23);
		add(checkBox_3);
		
		JLabel label = new JLabel("Bread Type:");
		label.setBounds(53, 193, 72, 14);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(135, 190, 79, 20);
		add(comboBox);
		
		JLabel label_1 = new JLabel("Quantity:");
		label_1.setBounds(53, 228, 60, 14);
		add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(135, 225, 44, 20);
		add(comboBox_1);
		
		JButton button = new JButton("Add to Cart");
		button.setBounds(224, 224, 110, 23);
		add(button);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMenuScreen();
			}
		});
		btnMenu.setBounds(245, 11, 89, 23);
		add(btnMenu);
		
		JButton btnViewCart = new JButton("View Cart");
		btnViewCart.setBounds(351, 11, 89, 23);
		add(btnViewCart);
	}
	private void showMenuScreen()
	{
	this.mainFrame.showMenuScreen();
	}
}
