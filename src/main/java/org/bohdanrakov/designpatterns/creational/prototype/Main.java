package org.bohdanrakov.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Human original = new Human(22, "Bohdan");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        System.out.println(factory.makeCopy());

        factory.setPrototype(new Human(23, "Slavik"));
        System.out.println(factory.makeCopy());
    }
}
