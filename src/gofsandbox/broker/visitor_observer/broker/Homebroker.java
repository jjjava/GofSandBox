    package gofsandbox.broker.visitor_observer.broker;

import gofsandbox.broker.visitor_observer.exchange.Future;
import gofsandbox.broker.visitor_observer.exchange.Paper;
import gofsandbox.broker.visitor_observer.exchange.Share;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 17/09/2014
 */
public class Homebroker implements PaperObserver {

    private String name;

    public Homebroker(String name) {
        this.name = name;
    }

     @Override
    public void notifyChange(Share share) {
        System.out.print(name + " notified. ");
        System.out.println(share.getCode() + " $" + share.getPrice());
    }
    @Override
    public void notifyChange(Future future) {
        System.out.print(name + " notified. ");
        System.out.println(future.getCode() + " $" + future.getPrice()+"|"+future.getYear());
    }
}
