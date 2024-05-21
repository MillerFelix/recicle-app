package com.usjt.recicle.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private String url = "jdbc:mysql://localhost:3306/recicle_bd";
    private String user = "root";
    private String password = "123456";
    private Connection connection = null;

    public ConexaoBD() {
    }

    public Connection getConnection() {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
            if (this.connection != null) {
                System.out.println("Conexão com o MySQL foi estabelecida com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao MySQL: " + e.getMessage());
        }
        return this.connection;
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
}
