package com.cga.actividad5;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        int mayor = 0, jugador = 0, sumaMedia = 0;
        boolean empate = false;
        
        for (int i = 1; i<3 ; i++){
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            System.out.println("\nEl Jugador " + (jugador+1) + " hace su lanzamiento:");
            System.out.println("Dado1: " + dado1);
            System.out.println("Dado2: " + dado2);
            int tirada = dado1 + dado2;
            sumaMedia += tirada;

            if (tirada > mayor){
                mayor = tirada;
                jugador = i;
            }else if(tirada == mayor){
                empate = true;
            }
        }

        System.out.printf("\nLa tirada mas alta es: %s\n",mayor);

        if (empate)
            System.out.println("Fue Empate");
        else
            System.out.println("El Jugador " + jugador + " es el ganador");

        System.out.println("La media de los 4 dados es: " + sumaMedia/4);

    }
    
    
}
