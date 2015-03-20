package gui;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FormDashBoard extends JPanel {
	public FormDashBoard() {
		
		JButton btnAddVehicle = new JButton("Add Vehicle");//
		JButton btnRemoveVehicle = new JButton("Remove Vehicle");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnAddVehicle)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnRemoveVehicle)))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnAddVehicle)
							.addComponent(btnRemoveVehicle))
						.addGap(30)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
						.addContainerGap())
			);
		setLayout(groupLayout);	
		
		PanelEditVehicle panelNewVehicle = new PanelEditVehicle();
		tabbedPane.addTab("New Vehicle", panelNewVehicle );
	}
}
