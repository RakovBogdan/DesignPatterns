package org.bohdanrakov.designpatterns.strucural.facade;

class HDD {

    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Copying data from disk");
        } else {
            System.out.println("Insert disk with data");
        }
    }
}
