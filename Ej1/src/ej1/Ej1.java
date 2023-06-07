/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        int dias = min/1400;
        
        
        System.out.println("El equivalente es: \n" + dias + " días \n" + ((min-(dias*1440))/60) + " horas" );
        
       
    }
    
}
