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
public class contador_do {
    int MAX_COUNT=(int)(Math.random()*100),inc;
    public void mostrarcontador3(){
        inc=1;
        do{
            System.out.println(inc);
            inc++;
        }while(inc<=MAX_COUNT);
    }
}
