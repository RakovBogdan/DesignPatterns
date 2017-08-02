package org.bohdanrakov.designpatterns.creational.factorymethod;

public class DigitalWatchMaker implements WatchMaker {

    public Watch createWatch() {
        return new DigitalWatch();
    }
}
