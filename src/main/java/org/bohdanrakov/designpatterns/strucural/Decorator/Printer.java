package org.bohdanrakov.designpatterns.strucural.Decorator;

class Printer implements PrinterInterface {

    private String value;

    Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print("Printing: " + value);
    }
}
