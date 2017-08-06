package org.bohdanrakov.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);

        chat.addUser(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello, I'am user 1");
        admin.sendMessage("ADMIN has joined the chat!!!");
    }
}
