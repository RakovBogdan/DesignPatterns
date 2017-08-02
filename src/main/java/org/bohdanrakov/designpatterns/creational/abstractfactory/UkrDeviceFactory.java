package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class UkrDeviceFactory implements DeviceFactory {

    public Mouse getMouse() {
        return new UkrMouse();
    }

    public Keyboard getKeyboard() {
        return new UkrKeyboard();
    }

    public Touchpad getTouchpad() {
        return new UkrTouchpad();
    }
}
