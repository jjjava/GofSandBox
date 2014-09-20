package gofsandbox.broker.visitor_observer.exchange;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public interface Upgradeable {

    void accept(UpdatePaper updatePaper);
}
