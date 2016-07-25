package com.conneector.conexion.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.connector.conexion.ConnexionBddOracle;

public class ConnexionBddOracleTest extends ConnexionBddOracle{

	@Test
    public void getConnectionTest() {
        //new ConnectionConfiguration();
        ConnexionBddOracle connexion = new ConnexionBddOracle();
       
        try {
			assertEquals(connexion.getConnectionOracle() != null, true);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
