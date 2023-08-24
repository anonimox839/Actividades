package com.cga.actividad6;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero :"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero :"));
        String msg = num1 == num2 ? "Son iguales" : "No son iguales";
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
