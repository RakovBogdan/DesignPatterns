package org.bohdanrakov.designpatterns.strucural.composite;

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}
