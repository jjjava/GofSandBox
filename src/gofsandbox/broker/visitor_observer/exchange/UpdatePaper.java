package gofsandbox.broker.visitor_observer.exchange;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public interface UpdatePaper {

    void update(Share s);
    void update(Future f);
}
