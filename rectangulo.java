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
public class rectangulo {
    int width = 2;
    int length = 10;
    public static void main(String[] args) {
        rectangulo rec = new rectangulo();
        int area = rec.length * rec.width;
        System. out.println("Area : " + area);
    }
}
