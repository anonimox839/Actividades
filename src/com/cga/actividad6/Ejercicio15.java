package com.cga.actividad6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        int random,op,suma = 0;
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 100; i++){
            random = (int) (Math.random()*100) + 1;
            num.add(random);
        }

        for (int n:num)
            suma+=n;
            
        do {

            System.out.println("====Que deseas saber?====");
            System.out.println("1.Conocer el mayor de los numeros");
            System.out.println("2.Conocer el menor de los numeros");
            System.out.println("3.Obtener la suma de todos los numeros");
            System.out.println("4.Obtener la media de todos los numeros");
            System.out.print("Introduzca un opcion: ");
            op = input.nextInt();
                
            switch(op){
    
                case 1:{
                    System.out.println("El máximo valor es: " + Collections.max(num) + "\n");
                    break;
                }
                case 2:{
                    System.out.println("El minimo valor es: " + Collections.min(num) + "\n");
                    break;
                }
                case 3:{
                    System.out.println("La suma de todos los numeros es:" + (suma) + "\n");    
                    break;
                }
                case 4:{
                    System.out.println("La media de la suma de todos los numeros es: " + (suma/num.size()) + "\n");
                    break;
                }
                default:{
                    System.out.println("Saliste del sistema con exito\n");
                    break;
                }
                
            }

        } while (op == 1 || op == 2 || op == 3 || op == 4);

        input.close();
    }
}
