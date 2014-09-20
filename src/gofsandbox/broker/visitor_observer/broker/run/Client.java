/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofsandbox.broker.visitor_observer.broker.run;

import gofsandbox.broker.visitor_observer.broker.Brokerage;
import gofsandbox.broker.visitor_observer.broker.Homebroker;
import gofsandbox.broker.visitor_observer.exchange.Future;
import gofsandbox.broker.visitor_observer.exchange.Paper;
import gofsandbox.broker.visitor_observer.exchange.Share;
import gofsandbox.broker.visitor_observer.exchange.StockExchange;
import gofsandbox.broker.visitor_observer.exchange.UpdatePaper;
import gofsandbox.broker.visitor_observer.exchange.UpdatePrice;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hudson
 */
public class Client {

    public static void main(String args[]) {
        StockExchange se = new StockExchange("BOVESPA");
        UpdatePaper up = new UpdatePrice();


        se.getPapers().add(new Share("OCX", 0.05));
        se.getPapers().add(new Share("CCX", 0.75));
        se.getPapers().add(new Share("OGX", 0.55));
        se.getPapers().add(new Share("CMX", 1.05));
        se.getPapers().add(new Share("CMX", 1.05));

        se.getPapers().add(new Future("APP", 0.99, "2014"));
        se.getPapers().add(new Future("APP", 0.66, "2015"));
        se.getPapers().add(new Future("APP", 0.33, "2016"));

        Brokerage brokerage = new Brokerage("XpInvestimentos");
        Homebroker homebroker = new Homebroker("H.Schumaker");

        for (Paper p : se.getPapers()) {
            p.attach(homebroker);
            p.attach(brokerage);
        }

        se.accept(up);
        try {
            Thread.sleep(10000);
            se.accept(up);
            Thread.sleep(10000);
            se.accept(up);
            Thread.sleep(10000);
            se.accept(up);
            for (Paper p : se.getPapers()) {
                p.detach(homebroker);
            }
            se.accept(up);
            Thread.sleep(10000);
            se.accept(up);
        } catch (InterruptedException ex) {
        }


    }
}
