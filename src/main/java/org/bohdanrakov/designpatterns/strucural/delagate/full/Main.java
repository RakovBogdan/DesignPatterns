package org.bohdanrakov.designpatterns.strucural.delagate.full;

public class Main {

    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setShape(new Circle());
        painter.draw();
        painter.setShape(new Triangle());
        painter.draw();
    }
}
