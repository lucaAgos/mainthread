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
public class ProcessoRunnable implements Runnable{
 private String S;
 private boolean stop;
    public ProcessoRunnable(String S) {
        this.S = S;
        stop=false;
    }
public void run(){
    while(!stop){
        
        System.out.println(S);
    }
}
public void stoppa(){
    stop=false;
}
}
