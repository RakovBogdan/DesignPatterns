package org.bohdanrakov.designpatterns.behavioral.visitor;

interface Element {

    void accept(Visitor visitor);
}
