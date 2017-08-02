package org.bohdanrakov.designpatterns.creational.abstractfactory;

public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
