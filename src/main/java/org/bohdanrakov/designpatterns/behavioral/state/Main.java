package org.bohdanrakov.designpatterns.behavioral.state;

public class Main {

    public static void main(String[] args) {

        Station melodia = new RadioMelodia();
        Radio radio = new Radio();
        radio.setStation(melodia);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
