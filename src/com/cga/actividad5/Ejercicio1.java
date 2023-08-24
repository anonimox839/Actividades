package com.cga.actividad5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        double peso, altura, imc;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca su peso (kg): ");
        peso = input.nextDouble();
        System.out.print("Introduzca su altura (m): ");
        altura = input.nextDouble();
        imc = peso/Math.pow(altura,2);
        System.out.print("Su indice de masa corporal es: " + imc);
        input.close();

    }

}
