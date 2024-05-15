package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) throws ExceptionDAO {
        String sql = "INSERT INTO usuarios (nome, email, senha) value (?, ?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.ps(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a Connection: " + e);
            }
        }
    }
}
