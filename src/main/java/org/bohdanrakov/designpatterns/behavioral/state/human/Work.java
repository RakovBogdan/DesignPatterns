package org.bohdanrakov.designpatterns.behavioral.state.human;

public class Work implements Activity {

    @Override
    public void doSomething(Human context) {
        System.out.println("Working");
        context.setState(new Weekend());
    }
}
