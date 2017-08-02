package org.bohdanrakov.designpatterns.creational.builder;

public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car BuildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}
