package org.bohdanrakov.designpatterns.behavioral.chain;

    class SmsLogger extends Logger{

    SmsLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("SMS: " + message);
    }
}
