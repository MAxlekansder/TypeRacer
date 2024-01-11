package com.example.springracer.JDBCConnector;

import com.example.springracer.Controller.Randomizer;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;


public class DatabaseGetter {

    public String getStringName() {
        Randomizer randomizer = new Randomizer();
        DatabaseConnector databaseConnector = new DatabaseConnector();
        String nameGenerator = "";
        try (Connection connection = DatabaseConnector.getConnection()) {
            String addDataToClasses = "SELECT SentenceName FROM SENTENCEGENERATOR where GeneratorId = ?";

            try (PreparedStatement statement = connection.prepareStatement(addDataToClasses)) {

                statement.setInt(0, randomizer.generateNumber());
                statement.executeUpdate();

                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()) { nameGenerator = resultSet.getString("SentenceName");}


            } catch (SQLException e) {
                DatabaseConnector.handleSQL(e);
            }
        } catch (SQLException e) {
            DatabaseConnector.handleSQL(e);
        }
        return nameGenerator;
    }

}
