package com.example.springracer.JDBCConnector;

import com.example.springracer.Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseWriter {

    public void writeUser(User user) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        try (Connection connection = DatabaseConnector.getConnection()) {
            String addPlayerActiveClass = "INSERT INTO TypeRacer.User (PlayerName) VALUES (?)";

            try (PreparedStatement statement = connection.prepareStatement(addPlayerActiveClass, Statement.RETURN_GENERATED_KEYS)) {

                statement.setString(1, user.getName());

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } catch (SQLException e) {
            DatabaseConnector.handleSQL(e);
        }
    }
}

