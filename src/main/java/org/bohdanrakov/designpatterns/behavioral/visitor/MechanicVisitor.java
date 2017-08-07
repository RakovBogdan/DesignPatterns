package org.bohdanrakov.designpatterns.behavioral.visitor;

public class MechanicVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Repair body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Checked car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Repaired " + wheel.getName() + " wheel");
    }
}
