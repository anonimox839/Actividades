package com.cga.ejercicio_Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static double calculadora (double num1, double num2, int op){


        switch(op){

            case 1:{
                return (num1 + num2);
            }
            case 2:{
                return (num1 - num2);
            }
            case 3:{
                return (num1 * num2);
            }
            case 4:{
                return (num1 / num2);
            }
            default:
                throw new InputMismatchException();
        
        }

    }
    

    public static void main(String[] args) {
        
        boolean tf = true;
        double num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        int op = 0;
        Scanner sc = new Scanner(System.in);

        while(tf){

            try {
                System.out.println("Introduzca primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Introduzca segundo numero: ");
                num2 = sc.nextDouble();
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Solo se permiten numeros\n");
                sc.nextLine();
            }

        }

        tf = true;

        while(tf){
            try {
                System.out.println("------------- Calcular: -------------");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicacion");
                System.out.println("4.Division");
                System.out.print("Opcion:");
                op = sc.nextInt();
                System.out.println("El resultado es " + calculadora(num1, num2, op));


                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Opcion invalida\n");
                sc.nextLine();
            }
        }

        sc.close();
    }
    
}
