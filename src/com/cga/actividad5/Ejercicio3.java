package com.cga.actividad5;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int n,m;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca primer numero: ");
        n = input.nextInt();
        System.out.println("Introduzca primer segundo: ");
        m = input.nextInt();
        System.out.printf("El numero mayor es: %d", Math.max(n, m));
        input.close();
        
    }
}
