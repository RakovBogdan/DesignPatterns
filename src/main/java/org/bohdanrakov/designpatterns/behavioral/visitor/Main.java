package org.bohdanrakov.designpatterns.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        Element car = new CarElement();
        Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();
        car.accept(hooligan);
        System.out.println();
        car.accept(mechanic);
    }
}
