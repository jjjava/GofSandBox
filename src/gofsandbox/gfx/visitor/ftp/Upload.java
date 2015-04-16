package gofsandbox.gfx.visitor.ftp;

import gofsandbox.broker.visitor_observer.broker.PaperObserver;
import java.io.File;
import java.util.Set;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Upload extends Core {

    private Set<GfxObserver> observers;

    public Upload(File[] files, String path) {
        super(files, path);
    }


    @Override
    public void attach(GfxObserver uploadObserver) {
        observers.add(uploadObserver);
    }

    @Override
    public void detach(GfxObserver uploadObserver) {
        observers.remove(uploadObserver);
    }
}
