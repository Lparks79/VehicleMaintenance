package model;

import java.util.Date;

public class Motorcycle extends Vehicle {

	public Motorcycle(Date year, String make, String model)
	{
		super(year, make, model);
	}
	private String type;
	
	
	//2stroke-4stroke
	
	//type enum(cruiser, standard, touring, sport, dirt, enduro)
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}
