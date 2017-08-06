package org.bohdanrakov.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat {

    private List<User> users = new ArrayList<>();

    void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User u: users) {
            u.getMessage(message);
        }
    }
}
