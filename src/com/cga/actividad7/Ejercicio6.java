package com.cga.actividad7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio6 {
    
    public int acertados (int[] nums, int[] numsGanar){

        int acertado = 0;

        for (int n:nums){
            for (int m:numsGanar){
                if (n == m){
                    acertado++;
                }
            }
        }
        
        return acertado;
    }



    public static void main(String[] args) {
        
        boolean tf = true;
        int nums[] = new int[6],numsGanar[] = new int[6];
        int j = 0;
        Scanner sc = new Scanner(System.in);
        Ejercicio6 fc = new Ejercicio6();

        for (int i = 0; i<numsGanar.length; i++){
            numsGanar[i] = (int) (Math.random()*99)+1;
        }
        
        Arrays.sort(numsGanar);
        System.out.println(Arrays.toString(numsGanar)); 
        
        do {
            
            try {

                System.out.print("Introduzca su numero " + (j+1) + " de los 6 numeros de la apuesta: ");
                nums[j] = sc.nextInt();
                if (j >= numsGanar.length-1)
                    tf = false;
                j++;

            } catch (InputMismatchException e) {

                System.out.println("Solo se permite numero enteros ");
                sc.nextLine();

            } catch (NoSuchElementException ex) {

                System.out.println("Comando o Elemento es invalido o no existe");
                sc.next();

            }

        } while (tf);

        
        System.out.println("Numeros acertados: " + fc.acertados(nums, numsGanar));

        sc.close();
    }
    
}
