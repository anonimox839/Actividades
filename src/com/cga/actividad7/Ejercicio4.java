package com.cga.actividad7;

public class Ejercicio4 {
    
    public static int numMaximo(int t[]){

        int max = Integer.MIN_VALUE;
        
        for (int n:t)
            if (n>=max)
                max = n;

        return max;
    }
    
    public static void main(String[] args) {
        
        int t[] = {1,3,6,4,9,5};

        System.out.println(numMaximo(t));

    }

}
