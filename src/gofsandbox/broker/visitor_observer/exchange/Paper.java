package gofsandbox.broker.visitor_observer.exchange;

import gofsandbox.broker.visitor_observer.broker.PaperObserver;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hudson
 */
public abstract class Paper implements Upgradeable {

    private String code;
    private double price;

    public Paper(String code, double price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public void accept(UpdatePaper updatePaper) {
    }

    public void attach(PaperObserver observer) {
    }

    public void detach(PaperObserver observer) {
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
