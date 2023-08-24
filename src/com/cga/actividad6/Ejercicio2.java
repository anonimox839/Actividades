package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int num = 1;
        String msg;
        Scanner input = new Scanner(System.in);

        while (num != 0) {
            
            System.out.print("Introduzca un numero diferente de 0: ");
            num = input.nextInt();

            msg = num % 2 == 0 ? "El numero es par" : "El numero es impar";
            System.out.println(msg);
            msg = num > 0 ? "El numero es positivo" : "El numero es negativo";
            System.out.println(msg);
            System.out.printf("El cuadrado de %s %s es \n\n" , num , (Math.pow(num, 2)));

        }

        input.close();

    }
}
