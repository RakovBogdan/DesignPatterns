package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class EnTouchpad implements Touchpad {

    public void track(int deltaX, int deltaY) {
        int distance = (int)Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moving by " + distance + " pixels");
    }
}
