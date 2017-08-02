package org.bohdanrakov.designpatterns.creational.builder;


public class SubaruBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Subaru");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}