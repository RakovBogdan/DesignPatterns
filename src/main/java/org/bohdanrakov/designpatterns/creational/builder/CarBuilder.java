package org.bohdanrakov.designpatterns.creational.builder;

abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    public Car getCar() {
        return car;
    }
}
