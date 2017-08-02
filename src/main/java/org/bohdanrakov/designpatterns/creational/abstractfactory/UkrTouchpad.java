package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class UkrTouchpad implements Touchpad {

    public void track(int deltaX, int deltaY) {
        double distance = (int)Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Переміщюсь на " + distance + " пікселів");
    }
}
