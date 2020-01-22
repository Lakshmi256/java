package com.bridgelabz.factorydesign;

public abstract class Computer {
	public abstract String getFname();

	public abstract String getLname();

	public abstract String getAddress();

	public abstract String getCity();

	public abstract String getState();

	public abstract String getZip();

	public abstract String getPhoneno();

	@Override
	public String toString() {
		return "fname=" + this.getFname() + ",lname=" + this.getLname() + ",address=" + this.getAddress() + ",city="
				+ this.getCity() + ",state=" + this.getState() + ",zip=" + this.getZip() + ",phoneno="
				+ this.getPhoneno();
	}
}
