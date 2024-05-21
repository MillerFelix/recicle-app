package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.Anotacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnotacaoDAO {

    public void salvar(Anotacao anotacao) {
        String sql = "INSERT INTO anotacoes (descricao, categoria_residuos) VALUES (?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, anotacao.getDescricao());
            ps.setObject(2, anotacao.getCategoriaResiduo());
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro na descrição : " + e.getMessage());
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