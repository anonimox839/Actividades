package com.cga.actividad6;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su nota:"));

        switch(nota){

            case 1: {
                JOptionPane.showMessageDialog(null, "LUNES");
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "MARTES");
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, "MIERCOLES");
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, "JUEVES");
                break;
            }
            case 5:{
                JOptionPane.showMessageDialog(null, "VIERNES");
                break;
            }
            case 6:{
                JOptionPane.showMessageDialog(null, "SABADO");
                break;
            }
            case 7:{
                JOptionPane.showMessageDialog(null, "DOMINGO");
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Introduzca una nota del 1 al 7");
                break;
            }
        }
    }
}
