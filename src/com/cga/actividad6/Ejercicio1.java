package com.cga.actividad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int bingo = (int) (Math.random() * 100) + 1;
        // int num = new Scanner(System.in).nextInt();
        int num = -1, intento = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(bingo);

        do {
            
            try {

                System.out.print("Por favor introduzca un numero entre 1 y 100: ");
                num = input.nextInt();
    
                if (num > bingo)
                    System.out.println("El numero generado es menor que " + num + "\n");
                else if (num < bingo)
                    System.out.println("EL numero generado es mayor que " + num + "\n");
                    
                    
                } catch (InputMismatchException e) {
                    
                    System.out.println("Tipo de dato invalido");
                    input.nextLine();
                    
                } finally {
                    
                    intento++;
                    
                }
                
            } while (bingo != num);
            
            if (bingo == num)
                System.out.println("\nBINGO! Has adividado el numero secreto.\n" + "El numero de intento ha sido de " + intento);

        input.close();
    }
}
