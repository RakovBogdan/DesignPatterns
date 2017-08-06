package org.bohdanrakov.designpatterns.behavioral.state;

public class RadioSvoboda implements Station {
    @Override
    public void play() {
        System.out.println("Radio Svoboda playing...");
    }
}
