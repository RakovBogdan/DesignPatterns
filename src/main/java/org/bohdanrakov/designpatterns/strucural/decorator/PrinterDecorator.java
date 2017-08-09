package org.bohdanrakov.designpatterns.strucural.decorator;

abstract class PrinterDecorator implements PrinterInterface {

    PrinterInterface component;

    PrinterDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }
}
