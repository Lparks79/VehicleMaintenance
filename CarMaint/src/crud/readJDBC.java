package crud;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import model.Vehicle;

public class readJDBC 
{
	Vehicle vehicle1;
	public Vehicle getVehicle(int userId, int vehicleNum) {
		//TODO build vehicle object with database pull
		Date year =  null;
		String make = "TODO";
		String model = "TODO";
		vehicle1 = new Vehicle(year, make, model); 
		return vehicle1;
	}

	////////////////////////
	public void findMissing()
	{
		final String JDBC_Driver = "com.sql.jdbc.driver";
		final String DB_location = "jdbc:mysql://host/database";
		
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(DB_location, "username", "password");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT Id, Locatin FROM Documents");
			
			while(rs.next())
			{
				String Id = rs.getString("Id");
				String Location = rs.getString("Location");
				
				File f = new File("Location");
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boolean doesExist = f.exists();
				
				if(!doesExist)
				{
					System.out.println(Id + " " + Location);
				}
			}
			rs.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
