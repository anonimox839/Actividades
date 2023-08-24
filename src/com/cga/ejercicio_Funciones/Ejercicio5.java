package com.cga.ejercicio_Funciones;


public class Ejercicio5 {
    
    public static boolean esVocal(char caracter){
        
        return (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');

    }

    public static void main(String[] args) {
        
        char caracter;

        System.out.println("Intruduzca un caracater: ");
        caracter = Character.toUpperCase('i');
        
        if (esVocal(caracter))
            System.out.println("Es Vocal");
        else
            System.out.println("No es Vocal");


    }
    
}
