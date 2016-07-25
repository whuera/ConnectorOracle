package com.connector.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * The Class ConnexionBddOracle.
 */
public class ConnexionBddOracle {
	
	/** The Constant JDBC_DRIVER. */
	// driver name and database URL
	static final String JDBC_DRIVER = Messages.getString("ConnexionBddOracle.0"); //$NON-NLS-1$
	
	/** The Constant DB_URL. */
	static final String DB_URL = Messages.getString("ConnexionBddOracle.1"); //$NON-NLS-1$

	// Database credentials
	//static final String USER = "mobilpym_admin"; //$NON-NLS-1$
	//static final String PASS = "admin2016"; //$NON-NLS-1$

	/**
	 * Gets the connection oracle.
	 *
	 * @return the connection oracle
	 * @throws SQLException the SQL exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	public Connection getConnectionOracle() throws SQLException, ClassNotFoundException {
		Connection conn = null;

		try {
			Class.forName(Messages.getString("ConnexionBddOracle.4")); //$NON-NLS-1$
			conn = DriverManager.getConnection(Messages.getString("ConnexionBddOracle.5"), Messages.getString("ConnexionBddOracle.6"), Messages.getString("ConnexionBddOracle.7")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			System.out.println(Messages.getString("ConnexionBddOracle.8")); //$NON-NLS-1$
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
