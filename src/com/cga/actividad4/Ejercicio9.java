package com.cga.actividad4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        double num, num2;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        do {
            try {
                System.out.print("Introduzca numero decimal:");
                num = input.nextDouble();
                if (num < 0) num *= -1;
                int intPart = (int) num;
                System.out.println("Numero Decimal: " + num);
                System.out.println("Parte Entera: " + intPart);
                num2 = num - intPart;
                System.out.println("Parte Decimal: " + df.format(num2));
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);

        input.close();

    }
    
}
