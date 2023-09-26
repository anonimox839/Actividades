package com.cga.examenPracticoJava.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<Libro> cargar(){

        ArrayList<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro("84-121-2310-1", "El tránsito terreno", "Juan Luis Plancencia", "Novela", 1995, 23.45);
        Libro libro2 = new Libro("84-7489-146-9", "Sistemas Operativos", "Eric Bazilian", "Informática", 2001, 45.40);
        Libro libro3 = new Libro("84-305-0473-7", "Poemas intrínsecos", "Antonia Llorens", "Poesía", 1999, 17.50);
        Libro libro4 = new Libro("84-473-0120-6", "Avances en Arquitectura", "Helmut Richter", "Informática", 2005, 39.40);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        
        return libros;
    }

    //Metodo para listar
    public static void listar(ArrayList<Libro> libros){

        for (Libro libro : libros) {
            System.out.println("Libro -> " + libro);
        }

    }

    //Metodo que devuelve el libro con mayor precio
    public static Libro mayor(ArrayList<Libro> libros){

        Libro libroPrecioMayor = new Libro();

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getPrecio() > libroPrecioMayor.getPrecio()){
                libroPrecioMayor = libros.get(i);
            }
        }

        return libroPrecioMayor;

        // return Collections.max(libros, Comparator.comparingDouble(l -> l.getPrecio()));
    }

    //Metodo que imprime los libros de la cotegoria que se le indica
    public static void disponible(ArrayList<Libro> libros, String categoria){

        System.out.println("\nLibro pertenecientes a la categoria: " + categoria);
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCategoria().equals(categoria)) {
                System.out.println(libros.get(i));
            }
        }

    }

    //Metodo para ordenar Arraylist por su titulo
    public static void ordenar(ArrayList<Libro> libros){

        for (int i = 0; i < libros.size(); i++) {
            for (int j = i+1; j < libros.size(); j++) {
                if(libros.get(i).getTitulo().compareToIgnoreCase(libros.get(j).getTitulo()) > 0){
                    Collections.swap(libros, i, j);
                }
            }
        }

        System.err.println("\nListas de Libros ordenador por su titulo");
        listar(libros);

        // Collections.sort(libros, Comparator.comparing(l -> l.getTitulo()));

    }
    
    public static void main(String[] args) {
        
        //Variables
        int opcion = -1;
        ArrayList<Libro> libros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        //Menu
        while (opcion != 0) {
            
            System.err.println("\n------------------------------------------------");
            System.out.println("1.Cargar los datos de Libros en el ArrayList");
            System.out.println("2.Listar/Mostrar los Libros");
            System.out.println("3.Imprimir el libro de mayor precio");
            System.out.println("4.Imprimi libros por una categoria");
            System.out.println("5.Ordenar los libros por su titulo");
            System.out.println("0.Salir");
            System.err.println("------------------------------------------------\n");
            opcion = sc.nextInt();
    
            switch (opcion) {
    
                case 1 -> libros = cargar();
                case 2 -> listar(libros);
                case 3 -> System.out.println("\nEl libro mas caro es: " + mayor(libros));
                case 4 -> disponible(libros, "Informática");
                case 5 -> ordenar(libros);
                case 0 -> opcion = 0;
                default -> System.out.println("Opcion invalida");

            }
            
        }

        sc.close();
        
    }
    
}
