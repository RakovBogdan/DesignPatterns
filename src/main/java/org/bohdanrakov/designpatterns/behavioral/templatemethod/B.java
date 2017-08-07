package org.bohdanrakov.designpatterns.behavioral.templatemethod;

class B extends C {

    @Override
    void differ() {
        System.out.println("4");
    }

    @Override
    void differ2() {}
}
