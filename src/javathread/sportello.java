/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author agostinelli.luca
 */
public class sportello implements Runnable {

    conto conto;

    public sportello(conto conto) {
        this.conto = conto;
    }

    
    @Override
    public void run() {

    }

    public void versa(int somma) {
    conto.versa(somma);
  
    }

}
