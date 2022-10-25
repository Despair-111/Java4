package com.company;

public class PotentialEnergy {
    private static final double g = 9.8;
    private double h;
    private double m;

    public PotentialEnergy() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

   public static double Potentialenergy (double m, double h){
        return m*g*h;
   }

}
