
package br.com.alldirect.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
public static Connection getConnection(){
		try{
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			String serverName = "192.68.0.200:3306";
			String myDataBase = "estoque";
			String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
			String userName = "aluno";
			String passWord = "123456";
			Connection connection = DriverManager.getConnection(url, userName,passWord);
			return connection;
		}catch (ClassNotFoundException e) {
			System.out.println("The specified driver was not found." + e);
			return null;
		} catch (SQLException e) {
			System.out.println("It was not possible to connect to database." + e);
			return null;
		}
	}
}
    

