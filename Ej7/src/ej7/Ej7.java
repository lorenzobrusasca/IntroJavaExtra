/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.*/
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int cont=0,valorMax=0,valorMin=100000,valor=0,suma=0;
        
        
        System.out.println("Ingrese la cantidad de números");
        int cant = leer.nextInt();
        
        while (cont!=cant)
            {
            cont=cont+1;
            System.out.println("Introduzca el valor del número");
            valor = leer.nextInt();
            if(valor>valorMax)
            {
            valorMax = valor;
            }
            if (valor < valorMin)
            {valorMin = valor;}
                
            suma = suma+valor;
            
            }
    
    
        System.out.println("El valor máximo es: " + valorMax + "\nEl valor mínimo es: " + valorMin + "\nEl promedio total es: " + (suma/cant) );
        
    
    }
}
