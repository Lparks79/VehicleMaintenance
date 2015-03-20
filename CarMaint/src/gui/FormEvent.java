package gui;

import java.util.EventObject;

public class FormEvent extends EventObject{
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent(Object source, String fname, String lname, String email, String phone) {
		super(source);
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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
}