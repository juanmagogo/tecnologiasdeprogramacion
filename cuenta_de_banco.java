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
public class cuenta_de_banco {
    private int balance;
    private int accountNumber;
    private String accountName;
    
    public cuenta_de_banco(int num, String name) {
        balance = 0;
        accountNumber = num;
        accountName = name;
    }
    public int getBalance() { return balance;}
public void credit(int amount){balance=balance+amount; }
public void debit(int amount) {balance = balance - amount;}
public String toString() {
    return ("#######################\n" + "Accountnumber: " + accountNumber + 
            "\nAccount name: "+ accountName + "\nBalance: $" + balance + 
            "\n#######################");
    }
}
