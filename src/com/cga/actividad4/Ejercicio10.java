package com.cga.actividad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        double num, num2;
        Scanner input = new Scanner(System.in);

        do {
            
            try {
                System.out.print("Introduzca numero decimal:");
                num = input.nextDouble();
                int intPart = (int) num;
                System.out.println("Numero Decimal: " + num);
                num2 = num - intPart;
                if (num2 >= 0.5) intPart++;
                System.out.println("Numero Redondeado: " + intPart);
                tf = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }

        } while (tf);


        input.close();

    }

}
