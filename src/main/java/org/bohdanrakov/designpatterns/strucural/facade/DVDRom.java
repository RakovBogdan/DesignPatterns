package org.bohdanrakov.designpatterns.strucural.facade;

class DVDRom {

    private boolean data = false;

    boolean hasData() {
        return data;
    }

    void load() {
        System.out.println("Disk loaded");
        data = true;
    }

    void unload() {
        System.out.println("Disk unloaded");
        data = false;
    }
}
