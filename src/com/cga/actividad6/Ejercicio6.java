package com.cga.actividad6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero :"));
        String msg = num % 2 == 0 ? "El numero es par" : "El numero es impar";
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
