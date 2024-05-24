package com.usjt.recicle.app.dao;

import java.sql.SQLException;
import com.usjt.recicle.app.model.Usuario;
import com.usjt.recicle.app.jdbc.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
     public Usuario validarCredenciais(String email, String senha) {
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha);

            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao verificar usuário: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar o ResultSet: " + e.getMessage());
                e.printStackTrace();
            }
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
        return usuario;
    }

//    public boolean validarCredenciais(String email, String senha) {
//        String sql = "SELECT COUNT(*) FROM usuarios WHERE email = ? AND senha = ?";
//
//        PreparedStatement ps = null;
//        Connection connection = null;
//        ResultSet rs = null;
//
//        try {
//            connection = new ConexaoBD().getConnection();
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, email);
//            ps.setString(2, senha);
//
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                int count = rs.getInt(1);
//                return count > 0;
//            }
//        } catch (SQLException e) {
//            System.err.println("Erro ao verificar usuário: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                System.err.println("Erro ao fechar o ResultSet: " + e.getMessage());
//                e.printStackTrace();
//            }
//            try {
//                if (ps != null) {
//                    ps.close();
//                }
//            } catch (SQLException e) {
//                System.err.println("Erro ao fechar o PreparedStatement: " + e.getMessage());
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                System.err.println("Erro ao fechar a Connection: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }
}
