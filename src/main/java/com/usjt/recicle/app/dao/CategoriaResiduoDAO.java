package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.CategoriaResiduo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaResiduoDAO {

    public static List<CategoriaResiduo> buscarTodasCategoriasResiduo() {
        List<CategoriaResiduo> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria_residuos";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                CategoriaResiduo categoriaResiduo = new CategoriaResiduo(id, nome, descricao);
                categorias.add(categoriaResiduo);
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

        return categorias;
    }

    public static CategoriaResiduo buscarResiduosPorId(Long id) {
        PreparedStatement ps = null;
        Connection connection = null;
        CategoriaResiduo categoriaResiduo = null;

        try {
            String sql = "SELECT * FROM categoria_residuos WHERE id = ?";

            connection = new ConexaoBD().getConnection();

            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                categoriaResiduo = new CategoriaResiduo();
                categoriaResiduo.setId(rs.getLong("id"));
                categoriaResiduo.setNome(rs.getString("nome"));
                categoriaResiduo.setDescricao(rs.getString("descricao"));
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
