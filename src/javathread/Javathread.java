/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agostinelli.luca
 */
public class Javathread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // processo T1 =new processo("T1");
         ProcessoRunnable p2= new ProcessoRunnable("p1");  //vuole una Stringa e li ho messo p1
        Thread T1=new Thread("p1");
        T1.start();
        conto c = new conto(2000); //2000 sarebbe il totale
        sportello sport1 = new sportello(c);
        sportello sport2 = new sportello(c);
        Thread genitore1 = new Thread(sport1);
        Thread genitore2 = new Thread(sport2);
        
        genitore1.start();
        genitore2.start();
        
    
    try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Javathread.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         
       

    }

}
