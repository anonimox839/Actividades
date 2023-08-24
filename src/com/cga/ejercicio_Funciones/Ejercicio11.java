package com.cga.ejercicio_Funciones;

public class Ejercicio11 {

    public static int calcule(int a, int n){
        
        
        if (n>1){
            return a*calcule(a, n-1);    
        }
        else
            return a;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(calcule(2, 3));
    }
}
