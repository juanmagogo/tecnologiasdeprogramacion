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
public class ShirtTest {
    public static void main(String[] args) {
        Shirt camisa []= new Shirt[2];
        for (int i=0;i<2;i++){
            camisa[i]=new Shirt();
        }
        camisa[0].setshirt(23.50f, 12032,"OXFORD");
        camisa[1].setshirt(123.65f, 21345, "POLO");
        for (int i=0;i<2;i++)
            System.out.println(camisa[i].printshirt());
    }
}
