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
}
