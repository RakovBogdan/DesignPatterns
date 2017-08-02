package org.bohdanrakov.designpatterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {

        WatchMaker maker = watchMaker("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker watchMaker(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        }
        throw new RuntimeException(maker + " watch maker is not supported");
    }
}
