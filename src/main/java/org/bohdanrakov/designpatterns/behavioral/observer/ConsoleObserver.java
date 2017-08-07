package org.bohdanrakov.designpatterns.behavioral.observer;

class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Temperature changed to: " + temperature +
            ", and pressure is: " + pressure);
    }
}
