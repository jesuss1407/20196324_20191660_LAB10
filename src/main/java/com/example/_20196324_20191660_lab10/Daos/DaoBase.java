package com.example._20196324_20191660_lab10.Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoBase {
    public Connection getConection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String username = "root";
        String password = "root";
        String database = "lab10";
        String url = "jdbc:mysql://localhost:3306/" + database + "?serverTimezone=America/Lima";

        return DriverManager.getConnection(url, username, password);

    }
}
