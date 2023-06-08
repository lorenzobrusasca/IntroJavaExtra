/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
    
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        int num=0,cont=0,contPares=0,contImpares=0;
        
        do{
            
            do{
            System.out.println("Introduzca un número");
            num = leer.nextInt();
            if (num<0)
            {System.out.println("Error, introduzca números positivos");}
            }
            while (num<0);
            
            if((num%5)==0)
            {break;}
            
            if(num%2!=0)
            {contImpares = contImpares+1;}
            else{contPares=contPares+1;}
            
            cont = cont+1;
        
        }
        
        while((num%5)!=0);
        
        System.out.println("Se ingresó un múltiplo de 5 \nLa cantidad de n°s pares es: " + contPares + "\nLa cantidad de n°s impares es: " + contImpares);
        
        
    }
    
}
