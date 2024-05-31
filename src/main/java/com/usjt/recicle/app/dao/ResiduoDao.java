package com.usjt.recicle.app.dao;

import com.usjt.recicle.app.jdbc.ConexaoBD;
import com.usjt.recicle.app.model.Residuo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResiduoDAO {

    public static List<Residuo> buscarResiduosPorCategoriaId(Long categoriaId) {
        List<Residuo> residuos = new ArrayList<>();
        String sql = "SELECT * FROM residuos WHERE categoria_residuos_id = ?";

        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            connection = new ConexaoBD().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setLong(1, categoriaId);
            rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                Long idCategoriaResiduo = rs.getLong("categoria_residuos_id");
                Residuo residuo = new Residuo(id, nome, idCategoriaResiduo);
                residuos.add(residuo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar resíduos: " + e.getMessage());
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

        return residuos;
    }
}
