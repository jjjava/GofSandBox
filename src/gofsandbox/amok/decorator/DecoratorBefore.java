package gofsandbox.amok.decorator;

/**
 *
 * @author hudson.sales
 */
public class DecoratorBefore {

    static class A {

        public void doIt() {
            System.out.print('A');
        }
    }

    static class AwithX extends A {

        @Override
        public void doIt() {
            super.doIt();
            doX();
        }

        private void doX() {
            System.out.print('X');
        }
    }

    static class AwithY extends A {

        @Override
        public void doIt() {
            super.doIt();
            doY();
        }

        public void doY() {
            System.out.print('Y');
        }
    }

    static class AwithZ extends A {

        @Override
        public void doIt() {
            super.doIt();
            doZ();
        }

        public void doZ() {
            System.out.print('Z');
        }
    }

    static class AwithXY extends AwithX {

        private final AwithY obj = new AwithY();

        @Override
        public void doIt() {
            super.doIt();
            obj.doY();
        }
    }

    static class AwithXYZ extends AwithX {

        private final AwithY obj1 = new AwithY();
        private final AwithZ obj2 = new AwithZ();

        @Override
        public void doIt() {
            super.doIt();
            obj1.doY();
            obj2.doZ();
        }
    }

    public static void main(String[] args) {
        A[] array = {new A(),new AwithX(), new AwithXY(), new AwithXYZ()};
        for (A array1 : array) {
            array1.doIt();
            System.out.print("  ");
        }
    }
}
