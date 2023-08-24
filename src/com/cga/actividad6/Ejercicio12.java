package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        double kgsManzana[] = new double[2], kgsPera[] = new double[2],totalManzana = 0,totalPera = 0;
        final double MANZADA = 2.35, PERA = 1.95;
        Scanner input = new Scanner(System.in);


        for (int i = 0; i<2; i++){
            System.out.println("Kilos vendidos en el semestre " + (i+1) + ": ");
            kgsManzana[i] = input.nextDouble();
            input.nextLine();
        }

        for (int i = 0; i<2; i++){
            System.out.println("Kilos vendidos en el semestre " + (i+1) + ": ");
            kgsPera[i] = input.nextDouble();
            input.nextLine();
        }

        for (double kg:kgsManzana){
            totalManzana += kg*MANZADA;
        }

        for (double kg:kgsManzana){
            totalPera += kg*PERA;
        }

        System.out.println("Total de venta Manzanas: " + totalManzana);
        System.out.println("Total de venta Peras: " + totalPera);

        input.close();
    }
}
