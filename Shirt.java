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
public class Shirt {
    float price;
    int Id;
    String type;
    public void setshirt(float precio, int id, String tipo){
        price = precio;
        Id = id;
        type = tipo;
    }
    public String printshirt(){
        return "El precio de la camisa tipo: "+ type + " es de :$"+ price + " y su ID es:" + Id;
    }
}
