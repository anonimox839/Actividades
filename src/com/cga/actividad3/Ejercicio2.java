package com.cga.actividad3;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Edad: ");
        String apellido = input.nextLine();
        System.out.println("Buenos dias\nMi nombre es " + nombre + " " + apellido);
        input.close();

    }
}
