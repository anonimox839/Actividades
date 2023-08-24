package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        boolean tf = true;
        int suma = 0, num, i = 1;
        Scanner input = new Scanner(System.in);
        
        do {

            do {
                
                try {
                    System.out.println("Introduzaca numero " + i + " a sumar: ");
                    num = input.nextInt();
                    suma += num;
                    i++;
                    tf = false;
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato invalido");
                    input.nextLine();
                }
                
            } while (tf);

            
        } while (i != 4);

        System.out.println("La suma total es: " + suma);
        input.close();
    }
}
