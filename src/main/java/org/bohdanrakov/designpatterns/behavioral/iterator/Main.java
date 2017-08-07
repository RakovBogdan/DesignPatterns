package org.bohdanrakov.designpatterns.behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator it = concreteAggregate.getIterator();
        while (it.hasNext()) {
            System.out.println((String)it.next());
        }
    }
}
