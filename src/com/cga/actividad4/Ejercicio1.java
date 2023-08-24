package com.cga.actividad4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        double f , c = 0, n = 9, m = 5;
        boolean tf = true;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);;
        DecimalFormat df = new DecimalFormat("#.00");
        
        do {
            try {
                System.out.print("Introduzca grado ºC a convetir: ");
                c = input.nextDouble();
                f = c*(n/m)+32;
                System.out.println("ºC" + df.format(c) + " grados es igual a: " + "ºF" + df.format(f));
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);
        
        input.close();

    }

}
