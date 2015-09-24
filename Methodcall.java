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
public class Methodcall {
public static void main(String[] args) {
    new Methodcall().start(); 
    new Methodcall().sayHello();
        
}
public void start() {  
    System.out.println("Resultado 1= " + new Methodcall().addTwo(3));
    System.out.println("Resultado 2= " + new Methodcall().addTwo(19));
}
public void sayHello(){
    System.out.println("HELLO!!");
}
public int addTwo(int a){
    a=a+2;
    return a;            
}

}
