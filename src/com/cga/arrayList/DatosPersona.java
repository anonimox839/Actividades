package com.cga.arrayList;

public class DatosPersona {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private String edad;
    private String calle;
    private int numCalle;
    private int cp;
    private String provincia;

    public DatosPersona(String nombre, String apellido, String dNI, String edad, String calle, int numCalle, int cp,String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
        this.edad = edad;
        this.calle = calle;
        this.numCalle = numCalle;
        this.cp = cp;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    
}
