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
public class temperatura {
    int farenheit=90;
    public float celsius(int far){
        float res=0.0f;
        res= (float)((far-32)*5)/9;
        return res;
    } 
    
}
