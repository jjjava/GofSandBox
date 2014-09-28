package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson Schumaker
 */
public class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return getPizza().getDescricao() + ", Peperoni";
    }

    @Override
    public double getCusto() {
        return getPizza().getCusto() + 3.00;
    }
}
