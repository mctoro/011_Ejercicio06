/*
 * Vamos a realizar un programa que, dado una lista de números existentes en una cadena de
 * caracteres separados por una coma (“,”), realice la suma de todos los números contenidos en la
 * misma y muestre el resultado en pantalla.
 */
package com.cice.ejercicio06;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Ejercicio06 {
    
    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca varios numeros separados con una coma");
        String dato = sc.nextLine();
        
        System.out.println("La cadena introducida es: " + dato);
        
String[] numeros = dato.split(",");
int i = 0;

for (String numero : numeros) {
    i += Integer.parseInt(numero);
}  
System.out.println(i);

    } 
}
