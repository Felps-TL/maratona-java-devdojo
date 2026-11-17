package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Car;

public class CarTest02ObjectReference {
    public static void main(String[] args) {
        Car car = new Car(); // First Object
        Car car2 = new Car(); // Second Object

        car.name = "LT";
        car.model = "Cruze";
        car.year = 2014;

        car2.name = "Fire";
        car2.model = "Uno";
        car2.year = 1991;

        //car = car2; // The first car is referencing the second one.

        System.out.println("Name: " + car.name + " | Model: " + car.model + " | Year: " + car.year);
        System.out.println("------------------------------------");
        System.out.println("Name: " + car2.name + " | Model: " + car2.model + " | Year: " + car2.year);
    }
}
