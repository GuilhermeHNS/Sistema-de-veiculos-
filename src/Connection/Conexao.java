/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guilh
 */
public class Conexao {
    public Connection getConnection() throws SQLException{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java-tania";
        String usuario = "root";
        String senha = "";
        
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(Exception ex){
            throw new RuntimeException("Erro de conexão", ex);
        }
    } 
}
