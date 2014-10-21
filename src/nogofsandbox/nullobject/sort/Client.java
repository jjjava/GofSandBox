package nogofsandbox.nullobject.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 * @since 18/10/2014
 */
public class Client {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int k = 0; k < 1000000; k++) {
            list.add(rnd.nextInt());
        }

        SortList ordernar = FactorySort.getInstance().getSort("nogofsandbox.nullobject.sort.HsQuickSort");
        ordernar.sort(list);

        for (int t : list) {
            System.out.println(t);
        }
    }
}
