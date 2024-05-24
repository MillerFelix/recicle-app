package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.Anotacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnotacaoDAO {

    public void salvar(Anotacao anotacao) {
        String sql = "INSERT INTO anotacoes (descricao, categoria_residuos) VALUES (?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, anotacao.getDescricao());
            ps.setLong(2, anotacao.getIdCategoriaResiduo());
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

    public static List<Anotacao> buscarTodasAnotacoes() {
        List<Anotacao> anotacoes = new ArrayList<>();
        String sql = "SELECT * FROM anotacoes";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong("id");
                String descricao = rs.getString("descricao");
                Long idCategoriaResiduo = rs.getLong("categoria_residuo_id");
                Anotacao anotacao = new Anotacao(id, descricao, idCategoriaResiduo);
                anotacoes.add(anotacao);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar categorias: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar o ResultSet: " + e.getMessage());
            }
        }

        return anotacoes;
    }

    public void excluir(Anotacao anotacao) {
        String sql = "DELETE FROM tabela_anotacoes WHERE descricao = ? AND id_categoria_residuo = ?";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, anotacao.getDescricao());
            ps.setLong(2, anotacao.getIdCategoriaResiduo());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Anotação excluída com sucesso.");
            } else {
                System.out.println("Nenhuma anotação encontrada com a descrição e categoria");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao excluir anotação: " + e.getMessage());
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
