package org.bohdanrakov.designpatterns.behavioral.visitor;

public class Main {

    public static void main(String[] args) {

        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor mechanic = new MechanicVisitor();

        body.accept(mechanic);
        engine.accept(mechanic);
    }
}
