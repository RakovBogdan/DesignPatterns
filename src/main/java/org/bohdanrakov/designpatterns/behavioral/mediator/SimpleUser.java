package org.bohdanrakov.designpatterns.behavioral.mediator;

class SimpleUser implements User {

    private Chat chat;

    SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User got message: \"" + message + "\"");
    }
}
