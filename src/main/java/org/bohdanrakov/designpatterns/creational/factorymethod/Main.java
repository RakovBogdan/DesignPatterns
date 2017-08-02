package org.bohdanrakov.designpatterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        Watch watch = new DigitalWatch();
        watch.showTime();
    }
}
