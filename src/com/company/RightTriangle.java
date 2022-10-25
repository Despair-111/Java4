package com.company;

public class RightTriangle {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public static void Lenght(double cathet1, double cathet2){
        System.out.println("Hypotenuse length: " + Math.sqrt(cathet1*cathet1+cathet2*cathet2));
    }

}
