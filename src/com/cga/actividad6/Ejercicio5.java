package com.cga.actividad6;

import javax.swing.JOptionPane;

public class Ejercicio5 {
 
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
        
    }
}
