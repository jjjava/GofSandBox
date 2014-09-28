package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson
 */
public class PizzaMuzarella extends PizzaDecorator {

    public PizzaMuzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Muzarella";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 2.00;
    }
}
