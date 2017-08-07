package org.bohdanrakov.designpatterns.behavioral.mediator;

class Admin extends User {

    Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getName() + " got message: \"" + message + "\"");
    }
}
