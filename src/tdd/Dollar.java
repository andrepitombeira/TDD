/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author andre
 */
public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}