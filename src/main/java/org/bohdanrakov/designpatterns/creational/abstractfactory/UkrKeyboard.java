package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class UkrKeyboard implements Keyboard {

    public void print() {
        System.out.print("Друкую строку");
    }

    public void println() {
        System.out.println("Друкую строку з переходом на нову");
    }
}
