package com.cga.actividad4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        double dolar = 1.1, euro;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00");

        do {
            
            try {
                System.out.print("Introduzca cantidad en euro: ");
                euro = input.nextDouble();
                dolar *= euro;
                System.out.print("€ " + df.format(euro) + " son: $ " + df.format(dolar));
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalida");
                input.nextLine();
            }

        } while (tf);

        input.close();
        
    }
}
