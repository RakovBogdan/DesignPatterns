package org.bohdanrakov.designpatterns.strucural.decorator;

class QuotesDecorator extends PrinterDecorator {

    QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
