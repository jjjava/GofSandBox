/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gofsandbox.pizza.decorator;

/**
 *
 * @author Hudson
 */
public class Client {
    public static void main(String args[]){
        Pizza pizza = new Pepperoni(new Catupiry(new PizzaMozzarella(new MassaPizza())));
        
        System.out.println(pizza.getDescricao());
        System.out.println(pizza.getCusto());
    }
}