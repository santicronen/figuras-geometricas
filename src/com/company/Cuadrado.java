package com.company;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public Cuadrado setLado(double lado) {
        this.lado = lado;
        return this;
    }

    public double perimetro(){
        double perimetro = lado * 4;
        return perimetro;
    }

    public double area(){
        return lado * lado;
    }
}
