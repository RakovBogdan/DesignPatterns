package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        DeviceFactory factory = getDeviceFactoryByCountryCode("Ukr");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        keyboard.println();
        touchpad.track(15, 20);
    }

    public static DeviceFactory getDeviceFactoryByCountryCode(String code) {

        switch (code) {
            case "Ukr":
                return new UkrDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country code: " + code);
        }
    }
}
