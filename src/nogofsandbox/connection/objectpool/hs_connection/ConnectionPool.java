package nogofsandbox.connection.objectpool.hs_connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 */
public class ConnectionPool implements IJdbcPool<Connection> {

    private final ArrayList<Connection> users;

    public ConnectionPool() {
        this.users = new ArrayList<>();
    }

    @Override
    public Connection aquire() {
        if (users.size() > 0) {
            return users.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void release(Connection c) {
        users.add(c);
    }

    @Override
    public void create(JDBCConnection c) {
        users.add(c.getConnection());
    }

    @Override
    public boolean validate(Connection c) {
        try {
            return (!((Connection) c).isClosed());
        } catch (SQLException e) {
            System.err.println(e);
            return (false);
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
    public int getSize() {
       return  users.size();
    }
}
