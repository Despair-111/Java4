package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //1
	Human human = new Human();
    human.setName("Vladimir");
    human.setSurname("Putin");
    human.setBirthYear(1952);
    human.Out();

    //2
        System.out.println(" ");
    System.out.println("Enter the length of the first catheter: ");
    double cathet1 = sc.nextDouble();
    System.out.println("Enter the length of the second catheter: ");
    double cathet2 = sc.nextDouble();
    RightTriangle.Lenght(cathet1, cathet2);

    //3
        System.out.println(" ");
        PotentialEnergy energy = new PotentialEnergy();
        System.out.println("Enter the mass: ");
        energy.setM(sc.nextDouble());
        System.out.println("Enter the height: ");
        energy.setH(sc.nextDouble());
        System.out.println("Potential energy: " + PotentialEnergy.Potentialenergy(energy.getM(), energy.getH()));

    }
}
