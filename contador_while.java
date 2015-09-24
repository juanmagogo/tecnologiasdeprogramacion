/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author juanma
 */
public class contador_while {
    int MAX_COUNT=(int)(Math.random()*100),inc;
    public void mostrarcontador(){
        inc=1;
        while(inc<=MAX_COUNT){
            System.out.println(inc);
            inc++;
        }
        
    }
    
    
}
