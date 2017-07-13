/*
solicitar al usuario que introduzca una serie de numeros, sumar el resultado de todos ellos. usaremos colecciones y solicitaremos si queremos o no seguir introduciendo numeros

 */
package com.cice.ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //bucle, condiciones, almacenar en colecciones y usar el scanner
 /*       
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        
      int i = 0;  
      
        do { 
            
            System.out.print("Introduce un numero: ");
            String dato = sc.nextLine();           
            System.out.println("Quieres introducir otro numero?");
            i += Integer.parseInt(dato);
        } while (false);
        System.out.println("La suma es: " + i);
        
 */     
      
ArrayList<Integer> lista = new ArrayList<>();
Scanner sc = new Scanner(System.in);

        do {           
            
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            lista.add(numero);
            //lista.add(sc.nextInt());
            System.out.println("Quieres introducir otro numero? S/N");
            String respuesta = sc.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                 break;              
            }
            
            
        } while (true);

        int resultado = 0;
        
        for (Integer numero : lista) {
            resultado += numero;
        }
        System.out.println("La suma de todos los numeros insertados es: " + resultado);
    }
    
}
