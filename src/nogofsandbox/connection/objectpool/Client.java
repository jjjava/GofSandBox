/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nogofsandbox.connection.objectpool;

import java.sql.Connection;

/**
 *
 * @author hudson.sales
 */
public class Client {

    public static void main(String args[]) {
    // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb","sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();
        // Use the connection


        // Return the connection:
        pool.checkIn(con);

    }
}
