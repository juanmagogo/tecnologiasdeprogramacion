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
