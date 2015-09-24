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
public class Area {
    public float area(float radio){
        float a;
        a= 3.14f*radio*radio;
        return a;
    }
    public float area(float base, float altura){
        float a;
        a=0.5f*base*altura;
        return a;
    }
    public float area(int base, int altura){
        float a;
        a= base * altura;
        return a;
    }
    public float area(float radio, int altura){
        float a;
        a= 3.14f*radio*radio*(float)altura;
        return a;
    }
}
