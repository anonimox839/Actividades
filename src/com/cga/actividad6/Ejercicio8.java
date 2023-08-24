package com.cga.actividad6;


import javax.swing.JOptionPane;

public class Ejercicio8 {
   
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero :"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero :"));
        
        String msg = num1 > num2 ? "El primer digito es mayor que el segundo" : "El segundo digito es mayor que el primero";
        JOptionPane.showMessageDialog(null, msg);
            
    }
}
