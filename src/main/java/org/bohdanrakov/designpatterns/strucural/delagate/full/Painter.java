package org.bohdanrakov.designpatterns.strucural.delagate.full;

class Painter {

    private Shape shape;

    void setShape(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        shape.draw();
    }


}
