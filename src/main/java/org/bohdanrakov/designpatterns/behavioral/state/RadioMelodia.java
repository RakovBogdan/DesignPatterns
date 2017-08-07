package org.bohdanrakov.designpatterns.behavioral.state;

public class RadioMelodia implements Station {
    @Override
    public void play() {
        System.out.println("Radio Melodia playing...");
    }
}
