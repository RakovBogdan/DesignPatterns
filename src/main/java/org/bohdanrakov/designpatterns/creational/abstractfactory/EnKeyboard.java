package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class EnKeyboard implements Keyboard {

    public void print() {
        System.out.print("printing");
    }

    public void println() {
        System.out.println("printing with new line");
    }
}
