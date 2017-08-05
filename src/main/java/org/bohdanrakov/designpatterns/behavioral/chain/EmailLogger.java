package org.bohdanrakov.designpatterns.behavioral.chain;

    class EmailLogger extends Logger{

    EmailLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Sending Email: " + message);
    }

}
