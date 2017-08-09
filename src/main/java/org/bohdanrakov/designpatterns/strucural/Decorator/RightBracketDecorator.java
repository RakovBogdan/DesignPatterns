package org.bohdanrakov.designpatterns.strucural.Decorator;

class RightBracketDecorator implements PrinterInterface {

    private PrinterInterface component;

    RightBracketDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
        System.out.print("]");
    }
}
