package gofsandbox.gfx.visitor.ftp;

import gofsandbox.broker.visitor_observer.broker.PaperObserver;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Upload extends Core implements Runnable {

    private Set<GfxObserver> observers;

    public Upload(File[] files, String path) {
        super(files, path);
        this.observers = new HashSet<>();
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void attach(GfxObserver uploadObserver) {
        observers.add(uploadObserver);
    }

    @Override
    public void detach(GfxObserver uploadObserver) {
        observers.remove(uploadObserver);
    }

    @Override
    public void run() {
        for (File f : files) {
            count++;
            System.out.println(count);
            System.out.println(f.getName());
            for (GfxObserver s : observers) {
                s.notifyChange(this);
            }
        }
    }
}
