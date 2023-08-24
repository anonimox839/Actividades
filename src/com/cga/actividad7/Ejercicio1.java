package com.cga.actividad7;

public class Ejercicio1 {
    

    public static void main(String[] args) {
        
        int suma = 0;
        int num[] = new int[10];
        
        for (int i = 0; i < 10; i++){
            num[i] = (int) (Math.random()*100) + 1;
            suma += num[i];
        }

        System.out.println("La suma de los valores aleatorios es  " + suma);

    }

}
