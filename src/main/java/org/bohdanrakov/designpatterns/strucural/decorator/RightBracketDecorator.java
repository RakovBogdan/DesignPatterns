package org.bohdanrakov.designpatterns.strucural.decorator;

class RightBracketDecorator extends PrinterDecorator {

    RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
