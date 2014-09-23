package nogofsandbox.connection.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hudson.sales
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

    private final String dsn, usr, pwd;

    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           System.err.println(e);
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException e) {
            System.err.println(e);
            return (null);
        }
    }

    @Override
    public void expire(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return !o.isClosed();
        } catch (SQLException e) {
            System.err.println(e);
            return (false);
        }
    }
}
