package com.cga.actividad4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    
        public static void main(String[] args) {

        boolean tf = true;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);;
        double f , c, n = 9, m = 5;
        DecimalFormat df = new DecimalFormat("#.00");

        do {
            try {
                System.out.print("Introduzca grado ºF a convetir: ");
                f = input.nextDouble();
                c = (f-32)*m/n;
                System.out.println("ºF" + df.format(f) + " grados es igual a: " + "ºC" + df.format(c));
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);
        
        
        input.close();

    }
}
