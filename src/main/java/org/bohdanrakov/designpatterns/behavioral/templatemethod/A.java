package org.bohdanrakov.designpatterns.behavioral.templatemethod;

class A extends C {

    @Override
    void differ() {
        System.out.println("2");
    }

    @Override
    void differ2() {
        System.out.println("5");
    }
}
