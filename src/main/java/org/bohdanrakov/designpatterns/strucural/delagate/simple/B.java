package org.bohdanrakov.designpatterns.strucural.delagate.simple;

class B {

    private A a = new A();

    void f() {
        a.f();
    }
}
