package com.company;

public class Elipse {
    private double radioMayor;
    private double radioMenor;

    public Elipse(double radioMayor, double radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    public double getRadioMayor() {
        return radioMayor;
    }
    public Elipse setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
        return this;
    }
    public double getRadioMenor() {
        return radioMenor;
    }
    public Elipse setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
        return this;
    }

    public double area(){
        return Math.PI * radioMayor * radioMenor;
    }
}
