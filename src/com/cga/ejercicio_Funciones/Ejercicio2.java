package com.cga.ejercicio_Funciones;

public class Ejercicio2 {
    
    public static void imprimirNums(int n, int m){

        if (m==n || m-n == 1 || n-m == 1)
            System.out.println("No hay nada que imprimir");


        else if (m>n){
            for (int i=n+1 ; i <= m-1 ; i++){
                System.out.println(i);
            }
        }

        else if (n>m){
            for (int i=n-1 ; i >= m-1 ; i--){
                System.out.println(i);
            }
        }        

    }

    public static void main(String[] args) {
        
        
        imprimirNums(-1, 1);
        
    }

}
