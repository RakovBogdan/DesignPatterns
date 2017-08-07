package org.bohdanrakov.designpatterns.behavioral.state.human;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}
