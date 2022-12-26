package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	
	public Connection getConnection() {
		try {
			
			
		final String url = "jdbc:mysql://localhost:3306/bdvendas";
		final String usuario = "root";
		final String senha = "pc1989";
	
			
		 return DriverManager.getConnection(url,usuario,senha);
	
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
