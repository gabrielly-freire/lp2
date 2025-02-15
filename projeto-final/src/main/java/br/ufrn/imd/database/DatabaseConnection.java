package br.ufrn.imd.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados.
 * @author Gabrielly Freire
 * @version 1.0
 */
public class DatabaseConnection {

    private static Connection conn = null;

    /**
     * Esse método é responsável por criar uma conexão com o banco de dados.
     * @throws DatabaseException caso ocorra um erro ao tentar se conectar com o banco de dados.
     * @return
     */
    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Credenciais para conexão com o banco de dados
                String url = "jdbc:mysql://localhost:3306/library_db";
                String user = "root";
                String password = "Password123#@!";

                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
        return conn;
    }

    /**
     * Esse método é responsável por fechar a conexão com o banco de dados.
     * @throws DatabaseException caso ocorra um erro ao tentar fechar a conexão com o banco de dados.
     * @return
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }
    
    /**
     * Esse método é responsável por fechar um Statement (instrução SQL).
     * @throws DatabaseException caso ocorra um erro ao tentar fechar um Statement.
     * @param st
     */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }
    
    /**
     * Esse método é responsável por fechar um ResultSet (conjunto de resultados de uma consulta SQL).
     * @throws DatabaseException caso ocorra um erro ao tentar fechar um ResultSet.
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    
    }
}
