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
public class divisiones {
    public static void main(String[] args) {
        int n1, n2, n3;
        float res1,res2;
        n1=(int)(Math.random()*10);
        n2=(int)(Math.random()*10);
        n3=(int)(Math.random()*10);
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        if(n1!= 0 && n2 != 0 ){
            res1=(float)n3/n1;
            res2=(float)n3/n2;        
            System.out.println(n3 + "/" + n1 + "=" + res1 );
            System.out.println(n3 + "/" + n2 + "=" + res2 );
        }else
           System.out.println("No se puede dividir entre 0!");
    }
}
