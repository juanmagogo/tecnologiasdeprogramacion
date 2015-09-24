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
public class calculadora {
    public int n1=10, n2=5,r=0;
    public float rd;
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        calc.r =  calc.n1 + calc.n2;
        System.out.println("Suma: "+ calc.r);
        calc.r =  calc.n1 - calc.n2;
        System.out.println("Resta: "+ calc.r);
        calc.r =  calc.n1 * calc.n2;
        System.out.println("Multiplicacion: "+ calc.r);
        calc.rd =  (float)(calc.n1 / calc.n2);
        System.out.println("Division: "+ calc.r);
    }
    
    
}
