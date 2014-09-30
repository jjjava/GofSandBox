/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson
 */
public class MassaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza";
    }

    @Override
    public double getCusto() {
        return 8.00;
    }
}
