package org.bohdanrakov.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 4, 8, 3, 8, 9, 2};

        StrategyClient client = new StrategyClient();
        client.setStrategy(new BubbleSort());
        client.executeStrategy(arrayToSort);

        client.setStrategy(new SelectionSort());
        client.executeStrategy(arrayToSort);
    }
}
