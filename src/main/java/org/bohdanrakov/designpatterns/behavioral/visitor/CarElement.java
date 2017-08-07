package org.bohdanrakov.designpatterns.behavioral.visitor;

class CarElement implements Element {

    private Element[] elements;

    CarElement() {
        this.elements = new Element[] {
                new WheelElement("front left"),
                new WheelElement("front right"),
                new WheelElement("rear left"),
                new WheelElement("rear right"),
                new BodyElement(),
                new EngineElement(),
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
