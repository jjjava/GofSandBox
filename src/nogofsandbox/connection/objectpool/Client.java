/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nogofsandbox.connection.objectpool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hudson.sales
 */
public class Client {

    public static void main(String args[]) throws SQLException {
    // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.ibm.as400.access.AS400JDBCDriver", "jdbc:as400://xxxx","xxxx", "xxxx");

        // Get a connection:
        Connection con = pool.checkOut();
        Connection con2 = pool.checkOut();
        // Use the connection
        System.out.println(con2.getCatalog());


        // Return the connection:
        pool.checkIn(con);
        

    }
}
