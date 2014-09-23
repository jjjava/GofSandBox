package nogofsandbox.connection.objectpool.hs_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hudson.sales
 */
public class OracleConnection extends JDBCConnection {

    private String instance;
    private String port;

    public OracleConnection(String instance, String port, String driver, String dsn, String usr, String pwd) {
        super(driver, dsn, usr, pwd);
        this.instance = instance;
        this.port = port;
    }

    @Override
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(UrlDrivers.getUrl(getDriver()) + getDsn() + ":" + getPort() + ":" + getInstance(), getUsr(), getPwd());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return conn;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
