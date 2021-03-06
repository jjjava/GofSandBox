package gofsandbox.box.flyweight;

/**
 *
 * @author hudson.sales
 */
import java.awt.*;

public class ColorBox extends Canvas implements Runnable {

    private int pause;
    private Color curColor = getColor();
    private static Color[] colors = {Color.black, Color.blue, Color.cyan,
        Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.red,
        Color.magenta, Color.orange, Color.pink, Color.white, Color.yellow};

    public ColorBox(int p) {
        pause = p;
        new Thread(this).start();
    }

    private static Color getColor() {
        return colors[ (int) (Math.random() * 1000) % colors.length];
    }

    @Override
    public void run() {
        while (true) {
            curColor = getColor();
            repaint();
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(curColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
