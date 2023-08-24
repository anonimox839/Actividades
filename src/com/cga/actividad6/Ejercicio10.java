package com.cga.actividad6;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su nota:"));

        switch(nota){

            case 1,2,3,4: {
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            }
            case 5:{
                JOptionPane.showMessageDialog(null, "Suficiente");
                break;
            }
            case 6:{
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            }
            case 7,8:{
                JOptionPane.showMessageDialog(null, "Notable");
                break;
            }
            case 9,10:{
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Introduzca una nota del 1 al 10");
                break;
            }



        }
    }
}
