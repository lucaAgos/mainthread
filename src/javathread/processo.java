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
public class processo extends Thread {
private String s;  

    public processo(String s) {
        this.s = s;
    }

public void run(){
    while(true){
        System.out.println(s);
    }
}
}
