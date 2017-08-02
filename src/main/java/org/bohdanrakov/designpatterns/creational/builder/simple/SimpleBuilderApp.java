package org.bohdanrakov.designpatterns.creational.builder.simple;

import org.bohdanrakov.designpatterns.creational.builder.Car;
import org.bohdanrakov.designpatterns.creational.builder.Transmission;

public class SimpleBuilderApp {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();
        System.out.println(car);
    }
}


class CarBuilder {

    String m = "Deafult";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder buildMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder buildMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}