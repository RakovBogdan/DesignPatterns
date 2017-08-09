package org.bohdanrakov.designpatterns.strucural.Decorator;

class QuotesDecorator implements PrinterInterface {

    private PrinterInterface component;

    QuotesDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
