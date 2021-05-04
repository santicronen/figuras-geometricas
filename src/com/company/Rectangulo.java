package com.company;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public Rectangulo setBase(double base) {
        this.base = base;
        return this;
    }
    public double getAltura() {
        return altura;
    }
    public Rectangulo setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public double perimetro(){
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    public double area(){
        return getBase() * getAltura();
    }
}