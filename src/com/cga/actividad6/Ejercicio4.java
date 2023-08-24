package com.cga.actividad6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
        int resp, num1, num2, record = 0;
        boolean correcto = true;
        Scanner input = new Scanner(System.in);

        do {

            num1 = (int) (Math.random()*100) + 1;
            num2 = (int) (Math.random()*100) + 1;
            resp = Integer.parseInt(JOptionPane.showInputDialog("Resultado de " + num1 + " + " + num2 + ":") );
            if (resp != num1+num2)
                correcto = false;
            record++;

        } while (correcto);

        JOptionPane.showMessageDialog(null, "Cantidad de operaciones realizadas correctamente: " + record);
        input.close();
        
    }
}
