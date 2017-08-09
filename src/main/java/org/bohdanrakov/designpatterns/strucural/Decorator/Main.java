package org.bohdanrakov.designpatterns.strucural.Decorator;

class Main {

    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(
                new LeftBracketDecorator(new RightBracketDecorator(new Printer("Bogdan"))));
        printer.print();
    }
}
