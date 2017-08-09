package org.bohdanrakov.designpatterns.strucural.delagate.full;

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
