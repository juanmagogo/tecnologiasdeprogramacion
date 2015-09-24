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
public class User {
    public static void main(String[] args) {
        Area area=new Area();
        
        System.out.println("Área de un Círculo= " + area.area(3.10f));
        System.out.println("Área de un Triángulo= " + area.area(12,12.5f));
        System.out.println("Área de un Rectángulo= " + area.area(12, 5));
        System.out.println("Área de un Cilindro= "+ area.area(12.3f, 10));
    }
    
 }
