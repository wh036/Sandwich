package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LoginScreen extends JPanel {
	private MainFrame mainFrame;
	private JPasswordField passwordField;
	private JTextField userField;
	
	/**
	 * @param main
	 */
	public LoginScreen(MainFrame main)
	{
		this.mainFrame = main;
		setLayout(null);
		
		JLabel lbl1 = new JLabel("Welcome");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl1.setBounds(169, 11, 197, 23);
		this.add(lbl1);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(52, 89, 62, 14);
		add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(52, 140, 62, 14);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 137, 105, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user= userField.getText();
				String pass= passwordField.getText();
				if (user.equals("admin") && pass.equals("password"))
				{
					
			        JOptionPane.showMessageDialog(null, "You have successfully logged in");
			        showMenuScreen();
			        
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong username or password");
				}
			}
		});
		btnLogin.setBounds(161, 193, 89, 23);
		add(btnLogin);
		
		userField = new JTextField();
		userField.setBounds(144, 86, 106, 20);
		add(userField);
		userField.setColumns(10);
		
	}
    private void showMenuScreen()
{
this.mainFrame.showMenuScreen();
}
	
}
