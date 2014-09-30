package gofsandbox.box.flyweight;

import java.awt.Frame;
import java.awt.GridLayout;

/**
 *
 * @author hudson.sales
 */
public class Client {

    public static void main(String[] args) {
        int size = 8, pause = 10;
        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        }
        if (args.length > 1) {
            pause = Integer.parseInt(args[1]);
        }
        Frame f = new Frame("ColorBoxes - 1 thread per ColorBox");
        f.setLayout(new GridLayout(size, size));
        for (int i = 0; i < size * size; i++) {
            f.add(new ColorBox(pause));
        }
        f.setSize(500, 400);
        f.setVisible(true);
    }
}
