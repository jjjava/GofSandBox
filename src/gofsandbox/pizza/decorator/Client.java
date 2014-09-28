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
        Pizza pizza = new PizzaMuzarella(new MolhoTomate(new Pepperoni(new Catupiry(null))));
        
        System.out.println(pizza.getDescricao());
        System.out.println(pizza.getCusto());
    }
}
