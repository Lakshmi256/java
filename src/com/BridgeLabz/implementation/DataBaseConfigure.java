package com.BridgeLabz.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.BridgeLabz.model.DataBaseConfig;

public class DataBaseConfigure {
	DataBaseConfig DB = new DataBaseConfig();

	public Connection DataBaseConfigure() throws SQLException, ClassNotFoundException {

		Class.forName(DB.getDbDriver());
		Connection con = DriverManager.getConnection(DB.getDbUrl(), DB.getDbUser(), DB.getDbPassword());
		return con;
	}

}
