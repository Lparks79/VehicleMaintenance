package model;

import java.util.Date;

public class OffRoad extends Vehicle {

	private int hours;
	
	public OffRoad(Date year, String make, String model)
	{
		super(year, make, model);
	}
	public void setHoursUsed(int hours)
	{
		this.hours = hours;
	}
	public int getHoursUsed()
	{
		return hours;
	}
}
