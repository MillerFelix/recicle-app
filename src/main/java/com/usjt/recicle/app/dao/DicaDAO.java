package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.Dica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DicaDAO {

    public static List<Dica> buscarTodasDicas() {
        List<Dica> dicas = new ArrayList<>();
        String sql = "SELECT * FROM dicas";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong("id");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                Long idCategoriaResiduo = rs.getLong("categoria_residuos_id");
                Dica dica = new Dica(id, titulo, descricao, idCategoriaResiduo);
                dicas.add(dica);
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

        return dicas;
    }

    public static Dica buscarDicasCategoriaResiduo(Long id) {
        Dica dica = null;
        String sql = "SELECT * FROM dicas WHERE id = ?";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                Long idCategoriaResiduo = rs.getLong("categoria_residuos_id");
                dica = new Dica(id, titulo, descricao, idCategoriaResiduo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar dica: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }

        return dica;
    }
}
