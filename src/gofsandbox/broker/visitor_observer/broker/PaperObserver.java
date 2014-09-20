package gofsandbox.broker.visitor_observer.broker;

import gofsandbox.broker.visitor_observer.exchange.Future;
import gofsandbox.broker.visitor_observer.exchange.Paper;
import gofsandbox.broker.visitor_observer.exchange.Share;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public interface PaperObserver {

    void notifyChange(Share share);
    void notifyChange(Future future);
}
