package com.cga.actividad7;


import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        double[] num = new double[5];

        for (int i = 0; i < num.length; i++)
            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el digito numero " + (i+1)));
 

        for (double n:num)
            System.out.print("[" + n + "] " );

    }
    

}
