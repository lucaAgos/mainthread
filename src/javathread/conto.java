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
public class conto {
    private int totale;
    private int  tasse=100;  
    
    public conto(int totale) {
       this.totale=totale;
    }
    
    public void versa(int somma){
        totale=totale+somma-tasse;
       System.out.println("conto:"+Saldo()); 
    }
public int Saldo(){
    return totale;
}

}
