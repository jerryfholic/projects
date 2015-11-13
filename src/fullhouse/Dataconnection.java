/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import java.sql.*;

/**
 *
 * @author Jerry
 */
public class Dataconnection {
    private static String url;
    private static String dbServer;
    private static String database;
    private static String user;
    private static String password;
    private static Connection activeConn;
    
    private static void init () throws ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        dbServer = "meru.hhs.nl";
        database = "13064096";
        user = "13064096";
        password = "Chefiecier";
        url = "jdbc:mysql://" + dbServer + "/" + database;
    }
    
    public static Connection getConnection () throws SQLException {
        if (activeConn == null) {
            activeConn = createConnection();
        }
        return activeConn;
    }
    
    public static void closeConnection () throws SQLException {
        activeConn.close();
        activeConn = null;
    }
    
    private static Connection createConnection () throws SQLException {
        Connection conn = null;
        try {
            init();
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}
