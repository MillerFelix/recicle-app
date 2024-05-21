
package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.Residuo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResiduoDao {
    
    
    public static void buscarResiduo(Residuo residuo) {
     String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
     
   
       PreparedStatement ps = null;
       Connection connection = null;
       
       
        try {
            connection = new ConexaoBD().getConnection();
             ps = connection.prepareStatement(sql);
            ps.setString(1, residuo.getNome());
            ps.setString(2, residuo.getDescricao());
            ps.execute();
        }
        
        catch (SQLException e) {
            System.err.println("Erro na descricao : " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar o PreparedStatement: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a Connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
 
     
 
 
 }
    
    

