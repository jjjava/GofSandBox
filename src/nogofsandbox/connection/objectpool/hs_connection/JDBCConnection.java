package nogofsandbox.connection.objectpool.hs_connection;

import java.sql.Connection;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class JDBCConnection {

    private String driver, dsn, usr, pwd;

    public JDBCConnection(String driver, String dsn, String usr, String pwd) {
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println(e);
        }
        this.driver = driver;
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    public abstract Connection getConnection();

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDsn() {
        return dsn;
    }

    public void setDsn(String dsn) {
        this.dsn = dsn;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
