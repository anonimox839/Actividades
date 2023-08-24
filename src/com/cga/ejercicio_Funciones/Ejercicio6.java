package com.cga.ejercicio_Funciones;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static boolean esVocal(char caracter){
        
        return (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');

    }

    public static void main(String[] args) {
        
        char caracter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Intruduzca un caracater: ");
        caracter = Character.toUpperCase(sc.next().charAt(0));
        
        if (esVocal(caracter))
            System.out.println("Es Vocal");
        else
            System.out.println("No es Vocal");

        sc.close();

    }
    
}