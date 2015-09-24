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
public class banco {
    public static void main(String[] args) {
        cuenta_de_banco ahorro= new cuenta_de_banco(1,"Alvaro García");
        cuenta_de_banco cheque= new cuenta_de_banco(19,"José Pérez");
        ahorro.credit(1000);
        System.out.println(ahorro);
        cheque.credit(500);
        System.out.println(cheque);
        cheque.credit(1500);
        System.out.println(cheque);
        cheque.debit(200);
        System.out.println(cheque);
        cuenta_de_banco micuenta;
        micuenta = cheque;
        System.out.println(micuenta);
    }
}
