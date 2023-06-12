/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int digit = 0;
        
        System.out.println("Introduzca un número");
        long num = leer.nextLong();
        
        while (num!=0){
        
            num = num/10;
            digit = digit+1;
                   
        }
        
        System.out.println("El número de dígitos es = "+ digit);
        
        
    }
    
}
