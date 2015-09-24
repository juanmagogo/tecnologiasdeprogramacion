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
public class semanaif {
    public static void main(String[] args) {
        int a;
        a=(int)(Math.random()*10);
        System.out.println("Número= "+ a);
        if (a==1){ 
            System.out.println("Lunes!!");
        }
        else if (a==2){ 
            System.out.println("Martes!!");
        }
        else if (a==3){ 
            System.out.println("Miercoles!!");
        }
        else if (a==4){ 
            System.out.println("Jueves!!");
        }
        else if (a==5){ 
            System.out.println("Viernes!!");
        }
        else if (a==6){ 
            System.out.println("Sabado!!");
        }
        else if (a==7){ 
            System.out.println("Domingo!!");
        }
        else{ 
            System.out.println("No corresponde a ningun dia de la semana!!");
        }
            
    }
}
