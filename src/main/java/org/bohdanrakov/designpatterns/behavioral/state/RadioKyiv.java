package org.bohdanrakov.designpatterns.behavioral.state;

public class RadioKyiv implements Station {

    @Override
    public void play() {
        System.out.println("Radio Kyiv playing...");
    }
}
