package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Vehicle;

import java.awt.CardLayout;

public class MainFrame extends JFrame 
{
	private Vehicle currentVehicle;
	
	private JPanel cards;
	private FormLogin panelLogin;
	private FormDashBoard dash;
	
	///Names for panels
	final static String LOGINPANEL = "Card with Login panel";
	final static String DASHPANEL = "Card with Dashboard panel";
	
	CardLayout cl;
	
	public MainFrame()
	{
		///setup mainFrame
		super("Vehicle Maintenance");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(SystemColor.window);
		this.getContentPane().setLayout(new BorderLayout());
		///set size and location
		this.setMinimumSize(new Dimension(400,400));
		this.pack();
		this.setLocationRelativeTo(null);
		
		///create panels
		panelLogin = new FormLogin();
		panelLogin.setBackground(SystemColor.window);
		dash = new FormDashBoard();
		dash.setBackground(SystemColor.window);
		
		///card layout
		cards = new JPanel(new CardLayout());
		cards.add(panelLogin, LOGINPANEL);
		cards.add(dash, DASHPANEL);
		this.add(cards);
	}

	public Vehicle getNewVehicle() {
		return currentVehicle;
	}
}
