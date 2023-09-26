package com.cga.examenPracticoJava.ejercicio5;


public class EstudianteInt extends Estudiante {

    private boolean esEramus;
    private String nacionalidad;

    public EstudianteInt() {
    }

    public EstudianteInt(String nombre, String direccion, int edad, String codigo, boolean esEramus, String nacionalidad) {
        super(nombre, direccion, edad, codigo);
        this.nacionalidad = nacionalidad;
        if(esEuropeo())
            this.esEramus = esEramus;
        else
            this.esEramus = !esEramus;
    }

    public boolean isEsEramus() {
        return esEramus;
    }

    public void setEsEramus(boolean esEramus) {
        this.esEramus = esEramus;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean esEuropeo(){
        return (nacionalidad.equals("ingles") || nacionalidad.equals("frances") || nacionalidad.equals("portugues"));
    }

    public boolean descuentoParaJovenes(){
        return (esEramus && edad<25);
    }

    @Override
    public String toString() {
        return "EstudianteInt [esEramus=" + esEramus + ", nacionalidad=" + nacionalidad + "]";
    }

    



}
