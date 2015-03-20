package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class ToolBar extends JPanel implements ActionListener {
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private IStringListener textListener;
	
	public ToolBar() {
		setBackground(SystemColor.window);
		setBorder(BorderFactory.createEtchedBorder());
		
		helloButton = new JButton("Hello");
		helloButton.setBackground(SystemColor.menu);
		goodbyeButton = new JButton("Goodbye");
		goodbyeButton.setBackground(SystemColor.menu);
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
	
	public void setStringListener(IStringListener listener) {
		this.textListener = listener;
	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
		}
		else if(clicked == goodbyeButton) {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
		}
		
	}
}
