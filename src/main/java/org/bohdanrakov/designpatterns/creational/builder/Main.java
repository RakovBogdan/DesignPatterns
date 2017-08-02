package org.bohdanrakov.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}
