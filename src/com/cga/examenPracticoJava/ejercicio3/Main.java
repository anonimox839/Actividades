package com.cga.examenPracticoJava.ejercicio3;

public class Main {
    
    public static void main(String[] args) {
        
        //Declacion y asignacion de varibles
        int arrNums[] = {1,524,423,825,1524,324,899,975,775,657};
        int numAlto = Integer.MIN_VALUE;
        int posicion = 0;

        //Recorrer el array
        for (int n : arrNums) {
            if (n > numAlto){
                numAlto = n;
                posicion++;
            }
        }

        //Mostrar numero mas alto y su respectiva posicion
        System.out.printf("El numero mas alto es %d en la posicion: %d", numAlto, posicion);

    }

}
