package com.usjt.recicle.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBD {
    private String url = "jdbc:mysql://localhost:3306";
    private String user = "root";
    private String password = "123456";
    private Connection connection = null;

    public ConexaoBD() {
    }

    public void getConnection() {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
            if (this.connection != null) {
                System.out.println("Conexão com o MySQL foi estabelecida com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao MySQL: " + e.getMessage());
        }
    }

    public void disconnect() {
        if (this.connection != null) {
            try {
                this.connection.close();
                System.out.println("Conexão com o MySQL foi encerrada.");
            } catch (SQLException e) {
                System.err.println("Erro ao encerrar a conexão: " + e.getMessage());
            }
        }
    }

//    public void executeUpdate(String query, Object... params) {;
//        try (PreparedStatement stmt = this.connection.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                stmt.setObject(i + 1, params[i]);
//            }
//            stmt.executeUpdate();
//            System.out.println("Consulta executada com sucesso.");
//        } catch (SQLException e) {
//            System.err.println("Erro ao executar a consulta: " + e.getMessage());
//        }
//    }
//
//    public ResultSet executeQuery(String query, Object... params) {
//        ResultSet resultSet = null;
//        try {
//            PreparedStatement stmt = this.connection.prepareStatement(query);
//            for (int i = 0; i < params.length; i++) {
//                stmt.setObject(i + 1, params[i]);
//            }
//            resultSet = stmt.executeQuery();
//        } catch (SQLException e) {
//            System.err.println("Erro ao buscar os resultados: " + e.getMessage());
//        }
//        return resultSet;
//    }
 }