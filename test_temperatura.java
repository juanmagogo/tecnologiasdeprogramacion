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
public class test_temperatura {
    public static void main(String[] args) {
        temperatura temp=new temperatura();
        System.out.println("Temperatura en Farenheit:"+temp.farenheit + " °F");
        System.out.println("Temperatura en Celcius:" + temp.celsius(temp.farenheit)+ " °C");
    }
}
