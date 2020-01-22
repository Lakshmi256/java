package com.bridgelabz.factorydesign;

public class SubClass extends Computer {
	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneno;

	public SubClass(String fname, String lname, String address, String city, String state, String zip, String phoneno) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneno = phoneno;
	}

	@Override
	public String getFname() {
		// TODO Auto-generated method stub
		return this.fname;
	}

	@Override
	public String getLname() {
		// TODO Auto-generated method stub
		return this.lname;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.address;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return this.city;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}

	@Override
	public String getZip() {
		// TODO Auto-generated method stub
		return this.zip;
	}

	@Override
	public String getPhoneno() {
		// TODO Auto-generated method stub
		return this.phoneno;
	}

}
