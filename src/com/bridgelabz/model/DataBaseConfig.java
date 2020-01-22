package com.bridgelabz.model;

public class DataBaseConfig {
	private String dbUser = "lp";
	private String dbPassword = "Lp@268742";
	private String dbName = "lp";
	private String dbdriver = "com.mysql.jdbc.Driver";
	private String dburl = "jdbc:mysql://localhost:3306/lp";
	public String getDbUser() {
		return dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbdriver() {
		return dbdriver;
	}
	public void setDbdriver(String dbdriver) {
		this.dbdriver = dbdriver;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	

}
