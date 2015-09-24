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
public class semanaswitch {
    public static void main(String[] args) {
        int a;
        a=(int)(Math.random()*10);
        System.out.println("Número= "+ a);
        switch(a){
            case 1: 
                System.out.println("Lunes!!");
                break;
            case 2: 
                System.out.println("Martes!!");
                break;
            case 3:
                System.out.println("Miercoles!!");
                break;
            case 4:
                System.out.println("Jueves!!");
                break;
            case 5:
                System.out.println("Viernes!!");
                break;
            case 6:
                System.out.println("Sabado!!");
                break;
            case 7: 
                System.out.println("Domingo!!");
                break;
            default : 
                System.out.println("No corresponde a ningun dia de la semana!!");
                break;
        }
    }
}
