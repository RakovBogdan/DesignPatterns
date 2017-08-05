package org.bohdanrakov.designpatterns.behavioral.chain;

public class Main {

    public static void main(String[] args) {

        Logger logger0 = new SmsLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);

        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("All ok", Level.INFO);
        logger0.writeMessage("Debugging", Level.DEBUG);
        logger0.writeMessage("System fail", Level.ERROR);

    }
}
