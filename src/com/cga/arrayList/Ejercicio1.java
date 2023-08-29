package com.cga.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int num = -1,suma = 0, contador = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);


        while (num != 0) {
            System.out.println("Introduzca numero que no sea cero: ");
            num = sc.nextInt();
            nums.add(num);
            if (num !=0)
                contador++;
        };

        for (Integer n:nums){
            suma += n;
        }

        System.out.println("La suma de total: " + suma);
        System.out.println("La media de la suma es: " + suma/contador);
        sc.close();
    
    }

    

}
