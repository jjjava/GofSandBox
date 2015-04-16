package gofsandbox.gfx.visitor.ftp;

import java.io.File;
import java.util.Set;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public class Download extends Core {

    private Set<GfxObserver> observers;
    
    public Download(File[] files, String path) {
        super(files, path);
    }

}
