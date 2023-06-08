/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    /*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/              
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la clase de socio; A - B o C");
        String tipoSocio = leer.next();
        
        System.out.println("Ingrese el costo del tratamiento:");
        double costo = leer.nextDouble();
        
        switch(tipoSocio)
        {
            case "A": System.out.println("El costo final es: " + (costo*0.50));
            break;
            case "B": System.out.println("El costo final es: " + (costo*0.65));        
            break;
            case "C": System.out.println("El costo final es: " + costo);
            break;
            default: System.out.println("Seleccionó una clase de socio incorrecta");
        
        }
        
        
    }
    
}
