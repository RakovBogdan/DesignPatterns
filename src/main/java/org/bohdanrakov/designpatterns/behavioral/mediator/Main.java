package org.bohdanrakov.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Bohdan");
        User user1 = new SimpleUser(chat, "John");
        User user2 = new SimpleUser(chat, "Volodymyr");
        User user3 = new SimpleUser(chat, "Petro");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user2.setEnable(false);

        admin.sendMessage("Hello!");
    }
}
