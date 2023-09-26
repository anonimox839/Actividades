package com.cga.examenPracticoJava.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void leeArray() throws InputMismatchException{
        int[] arryNums = new int[10];
        Scanner sc = new Scanner(System.in);

        //Leer
        for (int i=0; i<arryNums.length; i++){
            System.out.println("Introduzca el Digito " + (i+1) +" para el Array");
            arryNums[i] = sc.nextInt();
        }

        sc.close();

        //Mostrar
        System.out.print("\nEl contenido el array es: [-");
        for(int n:arryNums){
            System.out.print(n + "-");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

        // Declaracion de variables
        int num1 = 0, num2 = 0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Operacion operacion;

        // Entrada de datos
        try {
            System.out.println("Introduzca el primer digito");
            num1 = sc.nextInt();
            System.out.println("Introduzca el segundo digito");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! Solo se permite numero entero");
        }

        // Mostrar datos introducidos
        System.out.println("Los digitos introducidos son: " + num1 + " y " + num2);

        // Operaciones con los datos introducidos
        operacion = new Operacion(num1, num2);

        
        System.out.println("----Que operaciones deseas realizar?----");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Todoas las anteriores\n");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> operacion.suma();
            case 2 -> operacion.resta();
            case 3 -> operacion.multiplicar();
            case 4 -> {
                try {
                    operacion.dividir();
                } catch (ArithmeticException e) {
                    if (e.getMessage().equals("/ by zero"))
                        System.out.println("No se puede dividir entre 0");
                }

            }
            case 5->{
                operacion.suma();
                operacion.resta();
                operacion.multiplicar();
                try {
                    operacion.dividir();
                } catch (ArithmeticException e) {
                    if (e.getMessage().equals("/ by zero"))
                        System.out.println("No se puede dividir entre 0");
                }
            }
            default -> System.out.println("Se ha salido del programa Operacion");
        }

        //Lee array de 10 numeros y Mostrar
        try {
            System.out.println();
            leeArray();
        } catch (InputMismatchException e) {
            System.out.println("Haz introducido un dato Invalido");
        }

        //Cerrar Scanner
        sc.close();


    }
}
