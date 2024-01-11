package com.example.springracer.JDBCConnector;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DatabaseGetter {

    public String getStringName(int randomNumber) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        String nameGenerator = "";
        try (Connection connection = DatabaseConnector.getConnection()) {
            String addDataToClasses = "SELECT SentenceName FROM SENTENCEGENERATOR where GeneratorId = ?";

            try (PreparedStatement statement = connection.prepareStatement(addDataToClasses)) {

                statement.setInt(0,randomNumber);
                statement.executeUpdate();

                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()) { nameGenerator = resultSet.getString(nameGenerator);}



            } catch (SQLException e) {
                DatabaseConnector.handleSQL(e);
            }
        } catch (SQLException e) {
            DatabaseConnector.handleSQL(e);
        }
        return nameGenerator;
    }

}
