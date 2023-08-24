package com.cga.actividad6;

// import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int[] num = new int[3];
        int x = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++)
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el digito numero " + (i+1)));

        // Arrays.sort(num);

        for (int i = 0; i < num.length; i++)
            for (int j = i+1; j < num.length; j++)
                if (num[i] >= num[j]){
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }

        for (int n:num)
            System.out.print("[" + n + "] " );
    }
}
