package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        double peso, altura, imc;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        do {
            try {                
                System.out.print("Introduzca su peso (kg): ");
                peso = input.nextDouble();

                do {

                    try {
                        System.out.print("Introduzca su altura (m): ");
                        altura = input.nextDouble();
                        imc = peso/altura;
                        System.out.print("Su indice de masa corporal es: " + imc);
                        tf = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Tipo de dato invalido");
                        input.nextLine();
                    }
                    
                } while (tf);

            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);
        
        input.close();
    }
}
