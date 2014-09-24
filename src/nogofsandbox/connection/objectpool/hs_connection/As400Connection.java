package nogofsandbox.connection.objectpool.hs_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hudson Schumaker
 */
public class As400Connection extends JDBCConnection {

    public As400Connection(String driver, String dsn, String usr, String pwd) {
        super(driver, dsn, usr, pwd);
    }

    @Override
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(UrlDrivers.getUrl(getDriver()) + getDsn(), getUsr(), getPwd());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return conn;
    }
}