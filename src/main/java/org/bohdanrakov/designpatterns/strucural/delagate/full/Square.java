package org.bohdanrakov.designpatterns.strucural.delagate.full;

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
