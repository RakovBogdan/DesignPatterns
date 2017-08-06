package org.bohdanrakov.designpatterns.behavioral.strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

class StrategyClient {

    private Strategy strategy;

    void executeStrategy(int arr[]) {
        System.out.println("Sorting array: " + Arrays.toString(arr));
        strategy.sort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
