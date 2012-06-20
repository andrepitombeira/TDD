/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.andre.tdd;

/**
 *
 * @author andre
 */
public class Pair {

    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }
    
    public boolean equals(Object object){
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }
    
    public int hashCode(){
        return 0;
    }
}
