package gofsandbox.gfx.visitor.ftp;

import java.io.File;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public abstract class Core {

    private File files[];
    private String path;
    
    public Core(File files[], String path){
        this.files = files;
        this.path = path;
    }

    public void attach(GfxObserver observer) {
    }

    public void detach(GfxObserver observer) {
    }
}
