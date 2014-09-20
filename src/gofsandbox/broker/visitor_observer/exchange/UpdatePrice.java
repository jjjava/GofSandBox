package gofsandbox.broker.visitor_observer.exchange;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class UpdatePrice implements UpdatePaper {

    @Override
    public void update(Share s) {
        s.setPrice(s.getPrice() * 1.48);
    }

    @Override
    public void update(Future f) {
        f.setPrice(f.getPrice() * 1.73);
    }
}
