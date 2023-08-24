package com.cga.ejercicio_Funciones;

public class Ejercicio13 {
    
    public static long fibonacci(long n){
        long a,b,c;   

        if (n<2)
            return n;

        a=fibonacci(n-1);
        b=fibonacci(n-2);
        c = a+b;
        return c;

    }

    public static void main(String[] args) {
        

        System.out.println(fibonacci(5));


        int a=0, b=1, c = 0, n=5;

        for (int i = 1 ; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println(a);
    }
}
