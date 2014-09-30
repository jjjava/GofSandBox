/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson
 */
public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return pizza.getCusto();
    }

    public Pizza getPizza() {
        return pizza;
    }
}
