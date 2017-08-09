package org.bohdanrakov.designpatterns.strucural.Decorator;

class LeftBracketDecorator implements PrinterInterface {

    private PrinterInterface component;

    LeftBracketDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
