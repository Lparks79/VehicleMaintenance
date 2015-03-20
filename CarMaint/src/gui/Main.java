package gui;
import javax.swing.SwingUtilities;

import model.User;
import model.Vehicle;
import crud.readJDBC;
import crud.writeJDBC;


public class Main {
	//private String userName;
	private Vehicle myVehicle;
	private User user;
	
	public static void main(String[] args) {
		
		//create View
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MainFrame frame = new MainFrame();	
				frame.setVisible(true);
			}
		});
	}
	//create model
	public void createVehicle(Vehicle newVehicle)
	{
		//TODO  pass vehicle to writeJDBC
		boolean isCreated = false;
		myVehicle = newVehicle;
		
		writeJDBC writer = new writeJDBC();
		
		isCreated = writer.createVehicle(user.getUserId(), myVehicle);
	}
	public void retrieveVehicle(int vehicleNum)
	{
		readJDBC reader = new readJDBC();
		myVehicle = reader.getVehicle(user.getUserId(), vehicleNum);
	}
	public void createUser(User newUser)
	{
		boolean isCreated = false;
		user = newUser;
		
		writeJDBC writer = new writeJDBC();
		
		isCreated = writer.createUser(user);
	}
	
}
