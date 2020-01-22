package com.bridgelabz.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.bridgelabz.model.DataBaseConfig;

public class DataBaseConfigure {
	DataBaseConfig db = new DataBaseConfig();

	public Connection DataBaseConfigure() throws SQLException, ClassNotFoundException {

		Class.forName(db.getDbdriver());
		Connection con = DriverManager.getConnection(db.getDburl(), db.getDbUser(), db.getDbPassword());
		return con;
	}

}
