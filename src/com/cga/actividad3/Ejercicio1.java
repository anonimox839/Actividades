package com.cga.actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int edad = 0;
        boolean tf = true;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Edad: ");
        
        do {
            try {
                edad = input.nextInt();
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Dato invalido");
                input.nextLine();
            }
        } while (tf);

        input.nextLine();
        System.out.print("Modulo de Estudio: ");
        String modulo = input.next();
        System.out.println("Mi nombre es " + nombre + "\nTengo " + edad + " años\nEstudio programacion en el modulo " + modulo);
        input.close();
        
    }
}
