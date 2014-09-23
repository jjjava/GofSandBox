
package nogofsandbox.connection.objectpool.hs_connection;

/**
 *
 * @author hudson.sales
 */
public class UrlDrivers {

    private static final String AS400 = "jdbc:as400://";
    private static final String ORACLE = "jdbc:oracle:thin:@";
    private static final String MYSQL = "jdbc:mysql://";

    public static String getUrl(String driver) {
        if (driver.equalsIgnoreCase(DriversLibsNames.as400ClassName)) {
            return AS400;
        } else if (driver.equalsIgnoreCase(DriversLibsNames.oracleClassName)) {
            return ORACLE;
        } else if (driver.equalsIgnoreCase(DriversLibsNames.mySqlClassName)) {
            return MYSQL;
        }
        return null;
    }
}
