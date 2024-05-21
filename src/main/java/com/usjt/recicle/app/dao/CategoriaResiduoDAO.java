package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.CategoriaResiduo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaResiduoDAO {

    public static void buscarTodasCategorias(CategoriaResiduo categoriaResiduo) {
        String sql = "SELECT * FROM categoria_residuos";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoriaResiduo.getNome());
            ps.setString(2, categoriaResiduo.getDescricao());
            ps.execute();
        } catch (SQLException e) {
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

    public static CategoriaResiduo buscarResiduosPorNome(String nome) {

        PreparedStatement ps = null;
        Connection connection = null;
        CategoriaResiduo categoriaResiduo = null;

        try {
            String sql = "SELECT * FROM categoria_residuos WHERE nome = ?";
            
            ps = connection.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                categoriaResiduo = new CategoriaResiduo();
                categoriaResiduo.setNome(rs.getString("nome"));
                categoriaResiduo.setDescricao(rs.getString("descrição"));
//                categoriaResiduo.setDicas(rs.getString("dicas"));
            }
            rs.close();
            ps.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return categoriaResiduo;
    }
}
