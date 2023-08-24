package com.cga.actividad5;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        double radio;
        // double area;
        // final double PI = 3.14;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca el radio: ");
        radio = input.nextDouble();
        // area = Math.PI*Math.pow(radio, 2);
        System.out.printf("El area del cirulo es de: %.2f" , Math.PI*Math.pow(radio, 2));
        input.close();

    }
}
