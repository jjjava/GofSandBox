package nogofsandbox.connection.objectpool.hs_connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static int get8Days() {
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yy");
        String aux = "1" + df.format(new java.util.Date()) + (calendar.get(Calendar.DAY_OF_YEAR) - 8);
        return Integer.parseInt(aux);
    }

    public static void main(String[] args) {
        IJdbcPool<Connection> pool = new ConnectionPool();
        pool.create(new As400Connection(DriversLibsNames.as400ClassName, "xxxx", "xxx", "xxx"));
        pool.create(new As400Connection(DriversLibsNames.as400ClassName, "xxx", "xxxx", "xxx"));
        pool.create(new As400Connection(DriversLibsNames.as400ClassName, "xxx", "xxx", "xxxx"));

        System.out.println("Size:" + pool.getSize());

        Connection conn = pool.aquire();
        Connection conn2 = pool.aquire();
        Connection conn3 = pool.aquire();
        Connection conn4 = pool.aquire();
        System.out.println("Size:" + pool.getSize());

        int total = 0;
        try {
            String sql = "SELECT a3cai FROM proddta.f55m017 WHERE a3al1s <> '999' "
                    + "AND A3AL1S <> '981' AND A3UPMJ > " + get8Days() + "  ORDER BY A3UPMJ DESC";
            try (Statement stmt = conn4.createStatement()) {
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    total++;
                }
                rs.close();
            }
            pool.release(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println(total);
        System.out.println("Size:" + pool.getSize());
    }
}
