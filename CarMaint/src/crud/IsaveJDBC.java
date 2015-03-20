package crud;

import java.io.File;
import java.util.Date;

public interface IsaveJDBC 
{
	public boolean saveUser(String name, String email, String phone, String address);
	public boolean savePasseword(String password);
	public boolean saveVehicle(Date year, String Make, String Model);
	public boolean saveVehicle(Date year, String Make, String Model, int mileage);
	public boolean saveVehicle(Date year, String Make, String Model, int mileage, File image);
	public boolean saveLog();
}
