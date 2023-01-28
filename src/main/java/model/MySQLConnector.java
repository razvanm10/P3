package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    static final String dataBaseURL = "jdbc:mariadb://localhost:3306/swing_store_database";
    static final String username = "root1";
    static final String password = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dataBaseURL, username, password);
    }
}
