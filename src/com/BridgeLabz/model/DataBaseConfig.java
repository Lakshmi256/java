package com.BridgeLabz.model;

public class DataBaseConfig {
private String DbUser="lp";
private String DbPassword="Lp@268742";
private String DbName="lp";
private String DbDriver="com.mysql.jdbc.Driver";
private String DbUrl="jdbc:mysql://localhost:3306/lp";
public String getDbUser() {
	return DbUser;
}
public void setDbUser(String dbUser) {
	DbUser = dbUser;
}
public String getDbPassword() {
	return DbPassword;
}
public void setDbPassword(String dbPassword) {
	DbPassword = dbPassword;
}
public String getDbName() {
	return DbName;
}
public void setDbName(String dbName) {
	DbName = dbName;
}
public String getDbDriver() {
	return DbDriver;
}
public void setDbDriver(String dbDriver) {
	DbDriver = dbDriver;
}
public String getDbUrl() {
	return DbUrl;
}
public void setDbUrl(String dbUrl) {
	DbUrl = dbUrl;
}

}
