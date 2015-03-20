package model;

public class User {
	private String fName;
	private String lName;
	private String email;
	private String phone;
	private int[] vehicleID;
	private int userId;
	
	public User(int userId, String fName, String lName){
		email = "";
		phone = "";
		setUserId(userId);
		setfName(fName);
		setfName(lName);
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int[] getVehicleIDs() {
		return vehicleID;
	}

	public void addVehicleID(int[] vehicleID) {
		this.vehicleID = vehicleID; //TODO add additional vehicleID to array
	}

	public int getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}
	
	public void setUserId(int userId){
		this.userId = userId;
	}
}
