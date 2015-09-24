/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
/**
 * Intergrantes: Alexis Maturano Melgosa G1546004
 *               Jorge Meza Leal G1546008
 *               Juan Manuel fernandez Alvarez G1546001 
 *  Fecha: 24 sept
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
