package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(6, counter);
    }

    @Test
    public void testSelectedUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select u.FIRSTNAME, u.LASTNAME\n" +
                "from users u, posts p\n" +
                "where u.ID = p.USER_ID\n" +
                "group by u.ID\n" +
                "having count(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        assertEquals(1, counter);
    }
}