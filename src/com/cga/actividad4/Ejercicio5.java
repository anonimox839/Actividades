package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        double radio, area;
        final double PI = 3.14;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        do {

            try {
                System.out.print("Introduzca el radio: ");
                radio = input.nextDouble();
                area = PI*(radio*radio);
                System.out.print("El area del cirulo es de: " + area);
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }

        } while (tf);

        input.close();

    }
}
