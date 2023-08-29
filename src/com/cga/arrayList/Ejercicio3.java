package com.cga.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        boolean condicion = true;
        char c ;
        ArrayList<Persona> personas = new ArrayList<>();
        String nombre, apellido, DNI, calle, provincia;
        int numCalle, cp, edad;
        Persona persona;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("Indica el Nombre: ");
            nombre = sc.nextLine();
            
            System.out.println("Indica el Apellido: ");
            apellido = sc.nextLine();
            
            System.out.println("Indica DNI: ");
            DNI = sc.nextLine();
            
            System.out.println("Indica la edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Indica el Domicilio Calle: ");
            calle = sc.nextLine();
            
            System.out.println("Indica el numero de Calle: ");
            numCalle = sc.nextInt();
            
            System.out.println("Indica el cp: ");
            cp = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Indica el Provincia: ");
            provincia = sc.nextLine();
            
            persona = new Persona(nombre, apellido, DNI, edad, calle, numCalle, cp, provincia);
            
            personas.add(persona);
            
            System.out.println("\nDeseas Registrar otros Datos de Persona? \n Si = \"S\" o \"s\"     No = \"N\" o \"n\" ");
            c = sc.next().charAt(0);
            sc.nextLine();

            if (c == 'S' || c == 's')
                condicion = true;
            else if (c == 'N' || c == 'n')
                condicion = false;

        } while (condicion);

        for (Persona p:personas)
            System.out.println(p);

        sc.close();

    }
}
