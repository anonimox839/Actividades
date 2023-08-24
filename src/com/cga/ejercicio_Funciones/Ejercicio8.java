package com.cga.ejercicio_Funciones;

public class Ejercicio8{

    public static int divisoresPrimo(int n) {

        int contador = 0,numPrimo = 0;

        if (n<0)
            n *= -1;

        for (int i = 2; i<=n; i++){
            if (n % i == 0){
                int j = 1;
                contador = 0;
                do {
                    if(i%j == 0)
                        contador++;
                    j++;
                } while (contador<3 && j<=i);
                if (contador == 2)
                    numPrimo++;
            }
        }

        return numPrimo;
    }

    public static void main(String[] args) {
        

        System.out.println(divisoresPrimo(-60));
    }

}