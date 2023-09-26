package com.cga.examenPracticoJava.ejercicio5;

public class Estudiante extends Persona {
    
    private String codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String direccion, int edad, String codigo) {
        super(nombre, direccion, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  super.toString() + "Estudiante [codigo=" + codigo + "]";
    }

    
}
