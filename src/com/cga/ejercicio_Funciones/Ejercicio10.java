package com.cga.ejercicio_Funciones;

// import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class Ejercicio10 {

    public static String numMax(int num1, int num2, int num3){

        /* ArrayList<Integer> nums= new ArrayList<>();
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);

        return "" + Collections.max(nums); */

        int[] nums={num1,num2,num3};
        int numMax = Integer.MIN_VALUE;

        for (int n:nums){
            if (numMax < n)
            numMax = n;
        }

        return Integer.toString(numMax);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Indique segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Indique tercer numero: ");
        int num3 = sc.nextInt();
        System.out.println("El numero mas alto es: " + numMax(num1, num2, num3));
        sc.close();

    }

}
