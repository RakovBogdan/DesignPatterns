package org.bohdanrakov.designpatterns.strucural.delagate.full;

class Circle implements Shape {

    @Override
        public void draw() {
        System.out.println("Drawing Circle");
    }
}
