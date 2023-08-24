package com.cga.ejercicio_Funciones;

public class Ejercicio7 {

    public static boolean primo(int n){

        int contador = 0, i = 1;

        if (n<0)
        n *= -1;

        if(n == 0 || n ==1){
            return false;
        }

        do {

            if(n%i == 0)
                contador++;

            i++;
            
        } while (contador<3 && i<n);

        if (contador <3)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        
        if (primo(-10))
            System.out.println("Es un numero primo");
        else
            System.out.println("No es un numero primo");
    }

}
