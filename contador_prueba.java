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
public class contador_prueba {
    public static void main(String[] args) {
        contador_while cnt1 = new contador_while();
        contador_for cnt2 = new contador_for();
        contador_do cnt3 = new contador_do();
        System.out.println("Contador 1");
        System.out.println("Valor máximo:"+ cnt1.MAX_COUNT);
        cnt1.mostrarcontador();
        System.out.println("Contador 2");
        System.out.println("Valor máximo:"+ cnt2.MAX_COUNT);
        cnt2.mostrarcontador2();
        System.out.println("Contador 3");
        System.out.println("Valor máximo:"+ cnt3.MAX_COUNT);
        cnt3.mostrarcontador3();
    }
 
}
