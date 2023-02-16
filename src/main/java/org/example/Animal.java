package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private double peso =1;
    private Animal pareja;

    public Animal() {
    }

    public Animal(String nombre, String genero, double peso, Animal pareja) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.pareja = pareja;
    }


    //------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void setPareja(Animal pareja) {
        this.pareja = pareja;
    }


    //-------------------------------------------------------

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
