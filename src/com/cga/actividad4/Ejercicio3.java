package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double r, d;
 
        do {
            try {
                System.out.print("Introduzca el diametro de la circuferencia: ");
                d = input.nextDouble();
                r = d/2;
                System.out.print("El radio de la circunferencia es de: " + r);
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);
        
        input.close();
    }

}
