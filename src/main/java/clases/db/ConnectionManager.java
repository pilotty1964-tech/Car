package main.java.clases.db;

import main.java.clases.util.AppProperties;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.IOException;

public class ConnectionManager {
    private static ConnectionManager instance;
    private Connection connection;

    private ConnectionManager() {
        try {
            AppProperties.getInstance().load(); // Загрузка свойств
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database properties", e); // Без передачи причины
        }
    }

    public static synchronized ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String dbUrl = AppProperties.getInstance().getProperty("db_url");
            String dbUser = AppProperties.getInstance().getProperty("db_user");
            String dbPass = AppProperties.getInstance().getProperty("db_pass");
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        }
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
