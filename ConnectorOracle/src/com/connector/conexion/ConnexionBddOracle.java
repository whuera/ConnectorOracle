package com.connector.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBddOracle {
	// driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://198.27.83.229:3306/mobilpym_bdd";

	// Database credentials
	static final String USER = "mobilpym_admin";
	static final String PASS = "admin2016";

	public Connection getConnectionOracle() throws SQLException, ClassNotFoundException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "weho7755");
			System.out.println("Conexion Ok");
		} catch (SQLException e) {

			e.printStackTrace();
			System.exit(1);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.exit(2);
		}
		return conn;
	}

}
