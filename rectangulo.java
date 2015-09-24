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
public class rectangulo {
    int width = 2;
    int length = 10;
    public static void main(String[] args) {
        rectangulo rec = new rectangulo();
        int area = rec.length * rec.width;
        System. out.println("Area : " + area);
    }
}
