package com.cga.actividad4;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        boolean tf = true;
        int t, h, hf;
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println("Indica la hora actual: ");
                t = input.nextInt();
                System.out.println("Indica la Cantidad de hora: ");
                h = input.nextInt();
                hf = (h + t) % 24;
                System.out.println("En " + h + " horas, el reloj marcara las " + hf);
                tf = false;
            } catch (Exception e) {
                System.out.println("Tipo de dato invalido");
                input.nextLine();
            }
        } while (tf);


        input.close();
        
    }
}
