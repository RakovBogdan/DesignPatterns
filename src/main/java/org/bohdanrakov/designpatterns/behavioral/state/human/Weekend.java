package org.bohdanrakov.designpatterns.behavioral.state.human;

public class Weekend implements Activity {

    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Resting (Zzz)");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
