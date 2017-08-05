package org.bohdanrakov.designpatterns.behavioral.chain;

public class FileLogger implements Logger{

    int priority;
    Logger next;

    public FileLogger(int priority) {
        this.priority = priority;
    }

    @Override
    public void writeMessage(String message, int level) {
        if(level <= priority) {
            System.out.println("Writing to a file: " + message);
        }

        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    public void setNext(Logger next) {
        this.next = next;
    }
}
