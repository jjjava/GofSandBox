/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofsandbox.broker.visitor_observer.exchange;

import gofsandbox.broker.visitor_observer.broker.PaperObserver;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hudson
 */
public class Future extends Paper {

    private Set<PaperObserver> observers;
    private String year;

    public Future(String code, double price, String year) {
        super(code, price);
        this.year = year;
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

    public String getYear() {
        return year;
    }
}
