/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
       
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int numUsu=0,result=0;
        
        //Prueba
        System.out.println(num1);
        System.out.println(num2);
        
        do{
        System.out.println("\nIntroduzca el resultado a adivinar:");
        numUsu = leer.nextInt();
        
        result = num1*num2;
        
        if (numUsu==result) {
            System.out.println("El número ingresado fué correcto");
            break;
        }
        else  { System.out.println("El número ingresado fué incorrecto");}
        }
        while(numUsu!=result);
        
        
    }
    
}
