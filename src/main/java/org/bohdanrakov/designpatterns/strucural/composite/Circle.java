package org.bohdanrakov.designpatterns.strucural.composite;

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
