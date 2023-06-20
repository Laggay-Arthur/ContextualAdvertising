package com.contextadvertising.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDAO {
    public static void insertAccount(Connection connection) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO ACCOUNT(AVAIL_BALANCE, OPEN_BRANCH_ID, OPEN_EMP_ID,PRODUCT_CD) VALUES (?, ?, ?, ?)");
        //ps.setInt(1, 12);
        ps.setFloat(1, (float) 7.1);
        ps.setInt(2,1);
        ps.setInt(3,1);
        ps.setString(4,"CHK");
        ps.executeQuery();
    }
}
