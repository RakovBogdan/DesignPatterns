package org.bohdanrakov.designpatterns.behavioral.iterator;

public class ConcreteAggregate implements Aggregate{

    private String[] tasks = {"Build house", "Grow son","Plant tree"};

    @Override
    public Iterator getIterator() {
        return new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < tasks.length;
            }

            @Override
            public Object next() {
                return tasks[index++];
            }
        };
    }
}
