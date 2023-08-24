package com.cga.ejercicio_Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static String numMax(int num1, int num2){

        if (num1>num2)
            return "El numero mayor es: " + num1;
        else if (num1 == num2)
            return "Son iguales";
        else
            return "El numero mayor es: " + num2;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Indique segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println(numMax(num1, num2));
        sc.close();

    }
}
