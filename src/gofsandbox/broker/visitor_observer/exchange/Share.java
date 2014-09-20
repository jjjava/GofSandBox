package gofsandbox.broker.visitor_observer.exchange;

import gofsandbox.broker.visitor_observer.broker.PaperObserver;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class Share extends Paper {

    private Set<PaperObserver> observers;

    public Share(String code, double price) {
        super(code, price);
        this.observers = new HashSet<>();
    }

    @Override
    public void accept(UpdatePaper updatePaper) {
        updatePaper.update(this);
        for (PaperObserver s : observers) {
            s.notifyChange(this);
        }
    }

    @Override
    public void attach(PaperObserver shareObserver) {
        observers.add(shareObserver);
    }

    @Override
    public void detach(PaperObserver shareObserver) {
        observers.remove(shareObserver);
    }
}
