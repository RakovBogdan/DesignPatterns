package org.bohdanrakov.designpatterns.strucural.delagate;

class B {

    private A a = new A();

    void f() {
        a.f();
    }
}
