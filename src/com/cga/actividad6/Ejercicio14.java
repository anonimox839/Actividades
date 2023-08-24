package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        int num;
        String[] numero = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nuevo","diez"};
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca un numero entre 0 y 10:");
        num = input.nextInt();
        if (num >= 0 && num < 11)
            System.out.println(num + " corresponde a " + numero[num]);
        else
            System.out.println("El numero debe ser entre 0 y 10");

        input.close();
    }
}
