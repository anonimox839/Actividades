package com.cga.examenPracticoJava.ejercicio2;

public class Operacion {
    
    //Atributos
    private int num1, num2;

    //Contructor
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Metodos
    public void suma(){
        System.out.println("La suma de " + num1 + " y "+ num2 + " es: " + (num1+num2));
    }

    public void resta(){
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
    }
    
    public void multiplicar(){
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + (num1*num2));
    }
    
    public void dividir() throws ArithmeticException{
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + (num1/num2));
    }
}
