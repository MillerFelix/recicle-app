package com.usjt.recicle.app.dao;

import java.sql.SQLException;
import com.usjt.recicle.app.model.Usuario;
import com.usjt.recicle.app.jdbc.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
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
