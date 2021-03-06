
package nogofsandbox.connection.objectpool.hs_connection;

/**
 *
 * @author Hudson Schumaker
 * @param <T>
 */
public interface IJdbcPool<T> {
    T aquire();
    void release(T c);
    int getSize();
    void create(JDBCConnection c);
    boolean validate(T c);
    void expire(T c);
}
