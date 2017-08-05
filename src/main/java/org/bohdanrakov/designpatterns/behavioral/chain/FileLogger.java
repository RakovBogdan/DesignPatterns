package org.bohdanrakov.designpatterns.behavioral.chain;

    class FileLogger extends Logger{

    FileLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Writing to a file: " + message);
    }

}
