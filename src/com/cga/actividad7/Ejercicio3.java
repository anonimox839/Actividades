package com.cga.actividad7;


import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int num[] =  new int[Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros a guardar"))];


        for (int i = 0; i < num.length; i++)
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el digito numero " + (i+1)));


        for (int i = num.length-1; i>=0 ; i--)
            System.out.print("[" + num[i] + "] " );
    }
}
