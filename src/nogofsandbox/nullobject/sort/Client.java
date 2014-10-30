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
        final List<Integer> list = new ArrayList<>();
        final List<Integer> list2 = new ArrayList<>();
        final List<Integer> list3 = new ArrayList<>();
        Random rnd = new Random();

        for (int k = 0; k < 10000000; k++) {
            list.add(rnd.nextInt());
            list2.add(rnd.nextInt());
            list3.add(rnd.nextInt());
        }

//        for (int t : list) {
//            System.out.println(t);
//        }
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        SortList ordernar = FactorySort.getInstance().getSort("nogofsandbox.nullobject.sort.HsQuickSort");
                        ordernar.sort(list);
                    }
                }
        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        SortList ordernar = FactorySort.getInstance().getSort("nogofsandbox.nullobject.sort.HsQuickSort");
                        ordernar.sort(list2);
                    }
                }
        ).start();

//        new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        SortList ordernar = FactorySort.getInstance().getSort("nogofsandbox.nullobject.sort.HsQuickSort");
//                        ordernar.sort(list3);
//                    }
//                }
//        ).start();
    }
}
