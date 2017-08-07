package org.bohdanrakov.designpatterns.behavioral.mediator;

abstract class User {

    private Chat chat;
    private String name;
    private boolean isEnable = true;

    User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    String getName() {
        return name;
    }

    void sendMessage(String message) {
        chat.sendMessage(this, message);
    }

    abstract void getMessage(String message);

    boolean isEnable() {
        return isEnable;
    }

    void setEnable(boolean enable) {
        isEnable = enable;
    }
}
