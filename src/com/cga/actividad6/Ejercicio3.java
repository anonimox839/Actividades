package com.cga.actividad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int edad = 1,suma = 0,mayor = 0,alumnos = 0, intetos = 0, fallidos = 0;
        Scanner input = new Scanner(System.in);

        try {

            while (edad >= 0){
                
                System.out.println("Introduzca edad del alumno " + (alumnos + 1) + ": ");
                edad = input.nextInt();
    
                suma += edad;
                alumnos++;
                intetos++;
                if (edad > 17)
                    mayor++;
                    
            }

            System.out.println("El total de las edades es: " + suma);
            System.out.println("La edad media es de: " + suma/alumnos);
            System.out.println("Hay " + alumnos + " alumnos inscrito en el curso");
            System.out.println(mayor + " Son mayores de edad");
            
        } catch (ArithmeticException e) {

            System.out.println("No se puede resolver la operacion" + e.getMessage());
            input.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("Tipo de dato invalido");
            fallidos++;
            input.nextLine();

        }  finally {

            intetos++;
            System.out.println(intetos + " Intetos de registro de alumnos y " + fallidos + " fallidos por datos erroneos");
            
        }
        


        input.close();
    }
}
