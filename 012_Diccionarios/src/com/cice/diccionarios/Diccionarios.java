/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.diccionarios;

import java.util.Hashtable;

/**
 *
 * @author miguel
 */
public class Diccionarios {
    
    public static void main (String[] args){
    
        Hashtable<String,String> diccionario = new Hashtable<>();
        
        String dentroDelCajon = diccionario.put("cajon", "calculadora");
        
        System.out.println(dentroDelCajon);
        
        dentroDelCajon = diccionario.put("cajon", "linterna");
        System.out.println(dentroDelCajon);
        
        dentroDelCajon = diccionario.put("cajon", "caja");
        System.out.println(dentroDelCajon);

        
    }
    
}
