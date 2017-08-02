package org.bohdanrakov.designpatterns.creational.factorymethod;

public class RomeWatchMaker implements WatchMaker {

    public Watch createWatch() {
        return new RomeWatch();
    }
}
