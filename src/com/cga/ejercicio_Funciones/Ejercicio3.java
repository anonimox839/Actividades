package com.cga.ejercicio_Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static double areaCilindro(double radio, double altura){

        return 2*Math.PI*radio*(altura+radio);
        
    }

    public static double volumenCilindro(double radio, double altura){

        return Math.PI*Math.pow(radio, 2)*altura;

    }

    public static void main(String[] args) {
        
        boolean tf = true;
        double radio, altura;
        int op = 0;
        Scanner sc = new Scanner(System.in);

        do {
            
            try {
                System.out.println("===Que deseas Calcular?===");
                System.out.println("1.Area de un Cilindro");
                System.out.println("2.Volumen de de un Cilindro");
                System.out.println("3.Salir");
                op = sc.nextInt();
                tf = true;
    
                while (tf && (op == 1 || op == 2)){

                    try {

                        switch(op){
            
                            case 1:{
                                System.out.println("Indique radio: ");
                                radio = sc.nextDouble();
                                System.out.println("Indique altura: ");
                                altura = sc.nextDouble();
                                System.out.printf("El Area del Cilindro es: %.2f \n\n" , areaCilindro(radio, altura));
                                break;
                            }
                            
                            case 2:{
                                System.out.println("Indique radio: ");
                                radio = sc.nextDouble();
                                System.out.println("Indique altura: ");
                                altura = sc.nextDouble();
                                System.out.printf("El Volumen del Cilindro es: %.2f \n\n" , volumenCilindro(radio, altura));

                                break;
                            }
                            
                            case 3:
                            break;
            
                            default:{
                                throw new InputMismatchException();
                            }

                        }

                        tf = false;

                    } catch (InputMismatchException e) {
                        System.out.println("Tipo de dato invalido\n");
                        sc.nextLine();
                    }
    
                    
                }
                
                tf = false;
    
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida\n"); 
                sc.nextLine(); 
            } 
            
        } while (tf || op == 1 || op == 2);
        
        sc.close();
    }

}
