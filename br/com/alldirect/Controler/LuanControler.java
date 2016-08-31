/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.Controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alldirect.Connection.ConnectionFactory;

public class LuanControler {
     public static void main(String[] args) throws SQLException{
    
    Connection connection = ConnectionFactory.getConnection();
		
		String sql = "INSERT INTO produto (nome,descricao,preco,estoque)VALUES(?,?,?,?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, "A gente volta");
                stmt.setString(2, "G13");
                stmt.setDouble(3, 2040.49);
                stmt.setInt(4, 2);
                
		stmt.execute();
		stmt.close();
		
		System.out.println("Gravado!");
		
		connection.close();

     }
}
