package org.bohdanrakov.designpatterns.behavioral.state;

class Radio {

    private Station station;

    void nextStation() {
        if (station instanceof RadioKyiv) {
            setStation(new RadioMelodia());
        } else if (station instanceof RadioMelodia) {
            setStation(new RadioSvoboda());
        } else {
            setStation(new RadioKyiv());
        }
    }

    void play() {
        station.play();
    }


    void setStation(Station station) {
        this.station = station;
    }
}
