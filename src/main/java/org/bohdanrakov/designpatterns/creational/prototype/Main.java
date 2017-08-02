package org.bohdanrakov.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Human original = new Human(18, "Bohdan");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(copy);
    }
}
