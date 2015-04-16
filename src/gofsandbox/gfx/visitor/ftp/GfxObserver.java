package gofsandbox.gfx.visitor.ftp;

/**
 *
 * @author hudson.sales
 * @verison 1.0.0
 */
public interface GfxObserver {

    void notifyChange(Upload up);
    void nonotifyChange(Download down);
}
