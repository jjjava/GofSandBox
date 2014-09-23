
package nogofsandbox.connection.objectpool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author hudson.sales
 */
public class Client {

    public static void main(String args[]) throws SQLException {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.ibm.as400.access.AS400JDBCDriver", 
                "jdbc:as400://clm00010",
                "wsadm",
                "michelin");

        // Get a connection:
        Connection con = pool.checkOut();
        Connection con2 = pool.checkOut();
        Connection con3 = pool.checkOut();
        Connection con4 = pool.checkOut();
        Connection con5 = pool.checkOut();
        Connection con6 = pool.checkOut();
        Connection con7 = pool.checkOut();
        Connection con8 = pool.checkOut();
        Connection con9 = pool.checkOut();
        Connection con10 = pool.checkOut();
        Connection con11 = pool.checkOut();
        Connection con12 = pool.checkOut();
        Connection con13 = pool.checkOut();
        
        // Use the connection
        System.out.println(con13.getCatalog());
        
        System.out.println(con12.getCatalog());
         System.out.println(con2.getCatalog());
            System.out.println(con3.getCatalog());


        // Return the connection:
        pool.checkIn(con);
        

    }
}
