package com.contextadvertising.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDAO {
    public static void insertUser(Connection connection, String firstName, String lastName, String password, String email, String phone) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO USERS(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, PHONE) VALUES (?, ?, ?, ?, ?)");
        //ps.setInt(1, 12);
        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setString(3, password);
        ps.setString(4, email);
        ps.setString(5, phone);
        ps.executeQuery();
    }
}
