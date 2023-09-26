package com.cga.examenPracticoJava.ejercicio1;

public class Main {
    

    public static void main(String[] args) {
        
        //Crear array
        Alumno[] alunmos = new Alumno[10];

        //Rellenar array
        alunmos[0] = new Alumno("Jack", "Pen", 24);
        alunmos[1] = new Alumno("Hilary", "Smith", 34);
        alunmos[2] = new Alumno("Jeniffer", "Ferreira", 34);
        alunmos[3] = new Alumno("Ash", "Jackson", 21);
        alunmos[4] = new Alumno("Tom", "Guiller", 26);
        alunmos[5] = new Alumno("Chris", "Sokovic", 24);
        alunmos[6] = new Alumno("Jason", "Mimir", 34);
        alunmos[7] = new Alumno("Kiki", "Cedes", 23);
        alunmos[8] = new Alumno("Moises", "Vegas", 24);
        alunmos[9] = new Alumno("Ada", "Tirno", 21);

        //Mostrar array alumnos
        for (int i=0; i<alunmos.length; i++){
            System.out.println("Alumno" + (i+1) + alunmos[i].toString());
        }

    }
}
