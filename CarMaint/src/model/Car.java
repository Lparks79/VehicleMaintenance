package model;

import java.io.File;
import java.util.Date;

import crud.IsaveJDBC;

public class Car extends Vehicle implements IsaveJDBC {

	public Car(Date year, String make, String model) {
		super(year, make, model);
	}

	public boolean saveUser(String name, String email, String phone,
			String address) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean savePasseword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveVehicle(Date year, String Make, String Model) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveVehicle(Date year, String Make, String Model, int mileage) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveVehicle(Date year, String Make, String Model,
			int mileage, File image) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveLog() {
		// TODO Auto-generated method stub
		return false;
	}
}
