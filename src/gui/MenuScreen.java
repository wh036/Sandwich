package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;

public class MenuScreen extends JPanel {
	private MainFrame mainFrame;
	
	public MenuScreen(MainFrame main) {
		this.mainFrame = main;
		setLayout(null);
		
		JLabel label = new JLabel("Menu");
		label.setFont(new Font("Showcard Gothic", Font.ITALIC, 20));
		label.setBounds(187, 11, 65, 36);
		add(label);
		
		JButton button = new JButton("Tuna Sandwich");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showScreen01();
			}
		});
		button.setBounds(41, 125, 105, 23);
		add(button);
		
		JButton button_1 = new JButton("Beef Sandwich");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showScreen02();
			}
		});
		button_1.setBounds(265, 125, 124, 23);
		add(button_1);
		
		JButton button_2 = new JButton("Chicken Sandwich");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showScreen03();
			}
		});
		button_2.setBounds(41, 227, 117, 23);
		add(button_2);
		
		JButton button_3 = new JButton("Turkey Sandwich");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showScreen04();
			}
		});
		button_3.setBounds(272, 227, 117, 23);
		add(button_3);
	}
	private void showScreen01()
	{
	this.mainFrame.showScreen01();
	}
	private void showScreen02()
	{
	this.mainFrame.showScreen02();
	}
	private void showScreen03()
	{
	this.mainFrame.showScreen03();
	}
	private void showScreen04()
	{
	this.mainFrame.showScreen04();
	}
}
