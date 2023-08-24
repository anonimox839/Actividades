package com.cga.actividad7;

import java.util.Arrays;

public class Ejercicio5 {

    public int[] rellenaPares(int longitud, int fin) throws ArrayIndexOutOfBoundsException{

        int pares[] = new int[longitud];
        int random, i = 0;

        while (i < longitud){
            if (( random = (int) (Math.random()*fin) + 1)%2 == 0){
                pares[i] = random;
                i++;
            }
        }

        Arrays.sort(pares);

        return pares;
    }


    public static void main(String[] args) {
        
        Ejercicio5 fc = new Ejercicio5();

        try {
            System.out.println(Arrays.toString(fc.rellenaPares(10,60)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array fuera de rango");
        }
        
    }



    
}

