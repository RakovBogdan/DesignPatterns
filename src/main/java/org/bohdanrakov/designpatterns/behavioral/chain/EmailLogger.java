package org.bohdanrakov.designpatterns.behavioral.chain;

public class EmailLogger implements Logger{

    int priority;
    Logger next;

    public EmailLogger(int priority) {
        this.priority = priority;
    }

    @Override
    public void writeMessage(String message, int level) {
        if(level <= priority) {
            System.out.println("Writing email: " + message);
        }

        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    public void setNext(Logger next) {
        this.next = next;
    }
}
