package org.bohdanrakov.designpatterns.behavioral.visitor;

public class HooliganVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Started engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Scratched body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoked in car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Touched " + wheel.getName() + " wheel");
    }
}
