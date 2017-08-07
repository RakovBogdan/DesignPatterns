package org.bohdanrakov.designpatterns.behavioral.visitor;

class WheelElement implements Element {

    private String name;

    WheelElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    String getName() {
        return name;
    }
}
