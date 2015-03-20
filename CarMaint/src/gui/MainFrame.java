package gui;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Vehicle;
import java.awt.CardLayout;

public class MainFrame extends JFrame 
{
	//private TextPanel textPanel;
	//private ToolBar toolbar;
	private Vehicle currentVehicle;
	
	public MainFrame()
	{
		super("Vehicle Maintenance");
		getContentPane().setBackground(SystemColor.window);
		
//		JFrame frameLogin = new JFrame("Login");
		FormLogin panelLogin = new FormLogin();
		panelLogin.setBackground(SystemColor.window);
//		panelLogin.setVisible(true);
//		frameLogin.getContentPane().add(panelLogin);
		
		FormDashBoard dash = new FormDashBoard();
		dash.setBackground(SystemColor.window);
		CardLayout cl = new CardLayout(0,0);
		//dash.setVisible(true);
		
		cl.addLayoutComponent(dash, "name_98888839866220");
		//getContentPane().add(dash, "name_98888839866220");
		//getContentPane().add(panelLogin);
		cl.addLayoutComponent(panelLogin, "login");
		cl.show(panelLogin, "login");
		getContentPane().setLayout(cl);
		//panel.setBackground(SystemColor.window);
		//add(textPanel, BorderLayout.CENTER);
		
		setMinimumSize(new Dimension(400,400));
		setSize(732, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public Vehicle getNewVehicle() {
		return currentVehicle;
	}
}
