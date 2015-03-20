package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class testframe extends JFrame{
	private testPanel panel;
	public testframe() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		panel = new testPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
