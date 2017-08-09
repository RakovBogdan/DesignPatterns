package org.bohdanrakov.designpatterns.strucural.decorator;

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
