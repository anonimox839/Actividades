package com.cga.actividad5;

import java.util.Scanner;

public class Ejercicio4 {
    
        public static void main(String[] args) {
        
        int n,m;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca primer numero: ");
        n = input.nextInt();
        System.out.println("Introduzca primer segundo: ");
        m = input.nextInt();
        System.out.printf("El numero menor es: %d", Math.min(n, m));
        input.close();
        
    }
}

