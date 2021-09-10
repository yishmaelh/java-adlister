package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySqlUsersDao implements Users {
    private Connection connection;

    public MySqlUsersDao(Config config) throws Exception {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new Exception("Error connecting to database.", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String statement = "SELECT * FROM users WHERE username LIKE ?";
        User result = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(statement);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            result = new User(
                    rs.getLong("id"),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password")
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Long insert(User user) {
        String insert = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        Long result = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            result = rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
