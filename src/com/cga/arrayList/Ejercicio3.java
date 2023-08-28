package com.cga.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        boolean condicion = true;
        char c = ' ';
        ArrayList<DatosPersona> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Deseas Registrar Datos? \n Si = \"S\" o \"s\"     No = \"N\" o \"n\" ");
            c = sc.next().charAt(c);
            
            
        } while (condicion);

    }
}
