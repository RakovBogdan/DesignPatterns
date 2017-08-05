package org.bohdanrakov.designpatterns.behavioral.observer;

class Main {

    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());

        station.setMeasurements(25, 760);
        station.setMeasurements(25, 760);
    }
}
