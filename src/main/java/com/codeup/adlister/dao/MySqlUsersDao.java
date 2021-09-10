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
        return null;
    }
}
