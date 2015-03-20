package model;
//import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

public class Vehicle 
{
	private Date year;
	private String make;
	private String model;
	private int mileage;
	private File image; //BufferedImage

	public Vehicle(Date year, String make, String model)
	{		
		setYear(year);
		setMake(make);
		setModel(model);
	}
	
	//Model Year
	public void setYear(Date year){
		this.year = year;
	}
	public Date getFuel(){
		return year;
	}
	//Make of vehicle
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}
	//Model of vehicle
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	//Mileage
	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}
	public int getMileage()
	{
		return mileage;
	}
	//file address for picture of vehicle
	public void setImage(File image)
	{
		this.image = image;
	}
	public File getImage()
	{
		return image;
	}
}

