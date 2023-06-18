package gui;

import java.awt.CardLayout;

import javax.swing.JFrame;

import controller.Controller;
import data.Calculation;

public class MainFrame extends JFrame {

	private CardLayout card;
	private Controller cont;

	public MainFrame() {
		this.cont = new Controller();

		this.setTitle("Temasek Sandwich");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.card = new CardLayout();
		getContentPane().setLayout(this.card);

		this.showLoginScreen();

		this.setVisible(true);
	}

	public Controller getController() {
		return this.cont;
	}
	public void showLoginScreen() {
		LoginScreen li = new LoginScreen(this);
		getContentPane().add(li,"Login");
		this.card.show(this.getContentPane(), "Login");
	}

	public void showMenuScreen() {
		MenuScreen c1 = new MenuScreen(this);
		getContentPane().add(c1, "Menu");
		this.card.show(this.getContentPane(), "Menu");
	}

	public void showScreen01() {
		Screen01 tuna = new Screen01(this);
		getContentPane().add(tuna, "Tuna Sandwich");
		this.card.show(this.getContentPane(), "Tuna Sandwich");
	}

	public void showScreen02() {
		Screen02 p2 = new Screen02(this);
		getContentPane().add(p2, "Panel2");
		this.card.show(this.getContentPane(), "Panel2");
	}

	public void showScreen03() {
		Screen03 p3 = new Screen03(this);
		getContentPane().add(p3, "Panel3");
		this.card.show(this.getContentPane(), "Panel3");
	}
	public void showScreen04(){
		Screen04 p4 = new Screen04(this);
		getContentPane().add(p4, "Panel4");
		this.card.show(this.getContentPane(), "Panel4");
	}

	public static void main(String[] args) {
		MainFrame gui = new MainFrame();
	}

	public void showEditScreen(int index, Calculation calc) {
		EditScreen scGUI = new EditScreen(this, index, calc);
		getContentPane().add (scGUI, "EditScreen");
		this.card.show(this.getContentPane(), "EditScreen");
	}
}
