package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson
 */
public class PizzaMozzarella extends PizzaDecorator {

    public PizzaMozzarella(Pizza pizza) {
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
