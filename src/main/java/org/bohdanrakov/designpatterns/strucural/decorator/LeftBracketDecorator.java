package org.bohdanrakov.designpatterns.strucural.decorator;

class LeftBracketDecorator extends PrinterDecorator {

    LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
