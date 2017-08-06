package org.bohdanrakov.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough privileges");
        }
    }

    void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("There is no admin in the chat!");
        }

        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can't be user for another chat!"
                    + " (very controversial though)");
        }
    }

    @Override
    public void sendMessage(User user, String message) {
        if (user instanceof Admin) {
            for (User u: users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }

        if (user instanceof SimpleUser) {
            for (User u: users) {
                if (user != u && u.isEnable()) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }

    }
}
