package org.bohdanrakov.designpatterns.creational.builder;


public class FordMondeoBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Ford");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}