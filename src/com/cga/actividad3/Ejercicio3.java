package com.cga.actividad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int dato1, dato2, dato3 = 0, resultado;
        boolean tf = true;

        Scanner input = new Scanner(System.in);
         
        dato1 = 20;
        dato2 = 10;
        
        System.out.print("El primer dato es: " + dato1 + "\nEl segundo dato es: " + dato2 + "\nIntroduzca el tercer dato: ");

        do {
            try {
                dato3 = input.nextInt();
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Dato invalido, Introduzca numeros enteros");
                input.nextLine();
            }
        } while (tf);


        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        double dato1D = dato1, dato2D = dato2, dato3D = dato3, resultadoD = resultado;
        resultadoD = dato1D / dato2D / dato3D;
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultadoD);

        input.close();
            

    }
}
