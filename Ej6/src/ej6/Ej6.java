/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.*/
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int cuentaPetizo=0;
        double suma=0,sumaPetizo=0;
        
        
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt();
        
 
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la altura de la persona número " + (i+1));
            double alt = leer.nextDouble();
            
            suma = suma+alt;
            
            if (alt<1.60)
            {
                   sumaPetizo = alt + sumaPetizo;
                   cuentaPetizo = cuentaPetizo+1;
            
            }   
            }
        
        System.out.println("El promedio de estaturas es = " + (suma/N) + "\nEl promedio de estaturas menores a 1.60 es = " + (sumaPetizo/cuentaPetizo));
        
        
    }
    
}
