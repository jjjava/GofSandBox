package gofsandbox.broker.visitor_observer.exchange;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 */
public class StockExchange implements Upgradeable {

    private String name;
    private ArrayList<Paper> papers;

    public StockExchange(String name) {
        this.name = name;
        papers = new ArrayList<>();
    }

    @Override
    public void accept(UpdatePaper updatePaper) {
        for (Paper p : papers) {
            p.accept(updatePaper);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Paper> getPapers() {
        return papers;
    }
}
