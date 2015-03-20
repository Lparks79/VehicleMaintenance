package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class PanelEditVehicle extends JPanel {
	private JTextField txtVehicleName;
	private JTextField txtYear;
	private JTextField txtMake;
	private JTextField txtModel;
	private JTextField txtMileage;
	private JTextField txtServiceMileage;
	private JTextField txtCost;
	private JTextField txtServiceNotes;
	public PanelEditVehicle() {
		
		JLabel lblVehicleName = new JLabel("Vehicle Name: ");
		
		txtVehicleName = new JTextField();
		txtVehicleName.setColumns(10);
		
		JLabel lblYear = new JLabel("Year: ");
		
		JLabel lblMake = new JLabel("Make: ");
		
		JLabel lblModel = new JLabel("Model: ");
		
		JLabel lblMileage = new JLabel("Mileage: ");
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		
		txtMake = new JTextField();
		txtMake.setColumns(10);
		
		txtModel = new JTextField();
		txtModel.setColumns(10);
		
		txtMileage = new JTextField();
		txtMileage.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		
		JSeparator separator = new JSeparator();
		
		JTextPane txtNotes = new JTextPane();
		
		JLabel lblNotes = new JLabel("Notes");
		
		JTextPane textPaneHistory = new JTextPane();
		
		JLabel lblHistory = new JLabel("History");
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblSeriveEntry = new JLabel("Service Entry");
		
		JComboBox cmboxServiceType = new JComboBox();
		
		JLabel lblServiceMileage = new JLabel("Mileage: ");
		
		txtServiceMileage = new JTextField();
		txtServiceMileage.setColumns(10);
		
		JLabel lblCost = new JLabel("Cost: ");
		
		txtCost = new JTextField();
		txtCost.setColumns(10);
		
		JLabel lblServiceNotes = new JLabel("Notes: ");
		
		txtServiceNotes = new JTextField();
		txtServiceNotes.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHistory))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(textPaneHistory, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(14)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblModel)
										.addComponent(lblMake)
										.addComponent(lblYear)
										.addComponent(lblMileage)
										.addComponent(lblVehicleName))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtVehicleName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMake, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMileage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(44)
											.addComponent(lblNotes))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtNotes, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(68)
									.addComponent(btnUpdate)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblServiceMileage)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtServiceMileage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(cmboxServiceType, 0, 146, Short.MAX_VALUE)
								.addComponent(lblSeriveEntry)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblServiceNotes)
										.addComponent(lblCost))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtServiceNotes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVehicleName)
								.addComponent(txtVehicleName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNotes))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblYear)
										.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblMake)
										.addComponent(txtMake, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblModel)
										.addComponent(txtModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblMileage)
										.addComponent(txtMileage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(txtNotes, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdate))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblSeriveEntry)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(cmboxServiceType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtServiceMileage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblServiceMileage, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtCost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCost))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblServiceNotes)
									.addComponent(txtServiceNotes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblHistory)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPaneHistory, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
}
