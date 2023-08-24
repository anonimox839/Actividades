package com.cga.actividad5;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        double n,m;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el primer digito");
        n = input.nextDouble();
        System.out.println("Introduzca el segundo digito");
        m = input.nextDouble();
        System.out.printf("%s / %s = %.2f", n, m, n/m);
        input.close();
        
    }
}
