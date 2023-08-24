package com.cga.ejercicio_Funciones;

public class Ejercicio12 {
    
    public static int mcd(int a, int b){

        if (a<0)    
            a *= -1;
        else if (b<0)
            b *= -1;

        if (a > 0 && b > 0){
        
            if (a>=b)
                return mcd(a-b, b);
            else if(b>a)
                return mcd(a, b-a);
            
        }
        
        if(b == 0)
            return a;
        else
            return b;
      

    }

    public static void main(String[] args) {
        
        System.out.println("El maximo comun divisor de 48 y 60 es : " + mcd(48, 60));

    }
}
